package com.evaluation.controller;

import com.evaluation.entity.*;
import com.evaluation.enums.UserTypeEnum;
import com.evaluation.mapper.AdminEntityMapper;
import com.evaluation.mapper.StudentEntityMapper;
import com.evaluation.mapper.TeacherEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: chg
 * @date: 2020/3/23 15:14
 * @Description:
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private StudentEntityMapper studentEntityMapper;
    @Autowired
    private AdminEntityMapper adminEntityMapper;
    @Autowired
    private TeacherEntityMapper teacherEntityMapper;

    @PostMapping("/login")
    public Integer login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password,
                         @RequestParam(value = "userType") String userType) {

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        UserTypeEnum userTypeEnum = UserTypeEnum.getEventByCode(userType);
        Integer result = 0;
        switch (userTypeEnum) {
            case ADMIN:
                AdminEntityExample example = new AdminEntityExample();
                example.or().andUsernameEqualTo(username).andUserpwEqualTo(password);
                AdminEntity entity = adminEntityMapper.selectOneByExample(example);
                if (null != entity) {
                    result = 1;
                    session.setAttribute("loginUserType", UserTypeEnum.ADMIN.getCode());
                    session.setAttribute("loginUserId", entity.getUserid());
                }
                break;
            case TEACHER:
                TeacherEntityExample exampleTea = new TeacherEntityExample();
                exampleTea.or().andLoginNameEqualTo(username).andLoginPwEqualTo(password);
                TeacherEntity entity2 = teacherEntityMapper.selectOneByExample(exampleTea);
                if (null != entity2) {
                    result = 2;
                    session.setAttribute("loginUserType", UserTypeEnum.TEACHER.getCode());
                    session.setAttribute("loginUserId", entity2.getTeaId());
                }
                break;
            case STUDENT:
                StudentEntityExample exampleStu = new StudentEntityExample();
                exampleStu.or().andLoginNameEqualTo(username).andLoginPwEqualTo(password);
                StudentEntity studentEntity = studentEntityMapper.selectOneByExample(exampleStu);
                if (null != studentEntity) {
                    result = 3;
                    session.setAttribute("loginUserType", UserTypeEnum.STUDENT.getCode());
                    session.setAttribute("loginUserId", studentEntity.getStuId());
                }
                break;
            default:
                return 0;
        }
        return result;
    }

    @GetMapping("/getLogin")
    public String getCurrentLoginUser() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String loginUser = session.getAttribute("loginUserType").toString();
        return loginUser;
    }

    @RequestMapping("/logout")
    public Boolean logout() {
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session = request.getSession();
            session.removeAttribute("loginUserType");
            session.removeAttribute("loginUserId");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
