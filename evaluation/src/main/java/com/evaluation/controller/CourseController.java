package com.evaluation.controller;

import com.alibaba.fastjson.JSONObject;
import com.evaluation.dto.LoginUserDTO;
import com.evaluation.entity.*;
import com.evaluation.enums.UserTypeEnum;
import com.evaluation.mapper.*;
import com.evaluation.utils.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: chg
 * @date: 2020/3/23 23:03
 * @Description:
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseEntityMapper courseEntityMapper;
    @Autowired
    private AdminEntityMapper adminEntityMapper;
    @Autowired
    private TeacherEntityMapper teacherEntityMapper;
    @Autowired
    private CourseTeaEntityMapper courseTeaEntityMapper;
    @Autowired
    private StudentEntityMapper studentEntityMapper;

    @PostMapping("/add")
    public Integer add(@RequestBody CourseEntity entity) {
        return courseEntityMapper.insert(entity);
    }

    @PostMapping(value = "/delete", consumes = "application/json")
    public Integer delete(@RequestBody CourseEntity entity) {
        return courseEntityMapper.deleteByPrimaryKey(entity.getId());
    }

    @PostMapping("/update")
    public Integer update(@RequestBody CourseEntity entity) {
        return courseEntityMapper.updateByPrimaryKey(entity);
    }

    @RequestMapping("/select")
    public Layui select(@RequestParam(required = false) String courseName, @RequestParam(value = "page",defaultValue = "1") Integer page,
                        @RequestParam(value = "limit",defaultValue = "100") Integer limit) {
        CourseEntityExample example = new CourseEntityExample();
        if (!StringUtils.isEmpty(courseName)) {
            example.or().andCourseNameLike("%"+courseName+"%");
        }
        Long cou = courseEntityMapper.countByExample(example);
        return Layui.data(cou.intValue(), courseEntityMapper.selectByExamplePaging(example, page - 1, limit));
    }

    @RequestMapping("/getCourse")
    public CourseEntity getAdmin(@RequestParam(value = "id") Integer id) {
        return courseEntityMapper.selectByPrimaryKey(id);
    }

    @RequestMapping("/queryTeacherByCourseId")
    public Layui queryTeacherByCourseId(@RequestParam(value = "id") Integer id) {
        CourseTeaEntityExample example = new CourseTeaEntityExample();
        example.or().andCourseIdEqualTo(id);
        List<CourseTeaEntity> courseTeaEntities = courseTeaEntityMapper.selectByExample(example);
        if (courseTeaEntities.size() == 0) {
            return null;
        }
        TeacherEntityExample teacherEntityExample = new TeacherEntityExample();
        teacherEntityExample.or().andTeaIdIn(courseTeaEntities.stream().map(CourseTeaEntity::getTeacherId).collect(Collectors.toList()));
        List<TeacherEntity> teacherEntities = teacherEntityMapper.selectByExample(teacherEntityExample);
        return Layui.data(teacherEntities.size(), teacherEntities);
    }

    @RequestMapping("/updateLoginUser")
    public Integer updateLoginUser(@RequestBody LoginUserDTO loginUserDTO) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String loginType = session.getAttribute("loginUserType").toString();
        UserTypeEnum userTypeEnum = UserTypeEnum.getEventByCode(loginType);
        int userDTO = 0;
        switch (userTypeEnum) {
            case ADMIN:
                AdminEntity adminEntity = new AdminEntity();
                adminEntity.setUserid(loginUserDTO.getId());
                adminEntity.setUsername(loginUserDTO.getUsername());
                adminEntity.setUserpw(loginUserDTO.getPassword());
                userDTO = adminEntityMapper.updateByPrimaryKeySelective(adminEntity);
                break;
            case TEACHER:
                TeacherEntity teacherEntity = new TeacherEntity();
                teacherEntity.setTeaId(loginUserDTO.getId());
                teacherEntity.setLoginName(loginUserDTO.getUsername());
                teacherEntity.setLoginPw(loginUserDTO.getPassword());
                userDTO = teacherEntityMapper.updateByPrimaryKey(teacherEntity);
                break;
            case STUDENT:
                StudentEntity studentEntity = new StudentEntity();
                studentEntity.setStuId(loginUserDTO.getId());
                studentEntity.setLoginName(loginUserDTO.getUsername());
                studentEntity.setLoginPw(loginUserDTO.getPassword());
                userDTO = studentEntityMapper.updateByPrimaryKey(studentEntity);
                break;
            default:
                break;
        }
        return userDTO;
    }

    @RequestMapping("/getLoginUser")
    public LoginUserDTO getLoginUser() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String loginType = session.getAttribute("loginUserType").toString();
        String loginUserId = session.getAttribute("loginUserId").toString();
        UserTypeEnum userTypeEnum = UserTypeEnum.getEventByCode(loginType);
        LoginUserDTO userDTO = new LoginUserDTO();
        switch (userTypeEnum) {
            case ADMIN:
                AdminEntity adminEntity = adminEntityMapper.selectByPrimaryKey(Integer.parseInt(loginUserId));
                userDTO.setId(adminEntity.getUserid());
                userDTO.setUsername(adminEntity.getUsername());
                userDTO.setPassword(adminEntity.getUserpw());
                break;
            case TEACHER:
                TeacherEntity teacherEntity = teacherEntityMapper.selectByPrimaryKey(Integer.parseInt(loginUserId));
                userDTO.setId(teacherEntity.getTeaId());
                userDTO.setUsername(teacherEntity.getLoginName());
                userDTO.setPassword(teacherEntity.getLoginPw());
                break;
            case STUDENT:
                StudentEntity studentEntity = studentEntityMapper.selectByPrimaryKey(Integer.parseInt(loginUserId));
                userDTO.setId(studentEntity.getStuId());
                userDTO.setUsername(studentEntity.getLoginName());
                userDTO.setPassword(studentEntity.getLoginPw());
                break;
            default:
                break;
        }
        System.out.println(JSONObject.toJSONString(userDTO));
        return userDTO;
    }
}
