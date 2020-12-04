package com.evaluation.controller;

import com.evaluation.dto.TeacherDTO;
import com.evaluation.entity.*;
import com.evaluation.enums.UserTypeEnum;
import com.evaluation.mapper.CourseTeaEntityMapper;
import com.evaluation.mapper.PingjiaxinxiEntityMapper;
import com.evaluation.mapper.TeacherEntityMapper;
import com.evaluation.utils.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: chg
 * @date: 2020/3/23 15:35
 * @Description:
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherEntityMapper teacherEntityMapper;
    @Autowired
    PingjiaxinxiEntityMapper pingjiaxinxiEntityMapper;
    @Autowired
    CourseTeaEntityMapper courseTeaEntityMapper;

    @PostMapping("/add")
    public Integer add(@RequestBody TeacherDTO entity) {
        List<CourseTeaEntity> teaEntities = new ArrayList<>();
        for (int i = 0; i < entity.getCourseIds().length; i++) {
            CourseTeaEntity courseTeaEntity = new CourseTeaEntity();
            courseTeaEntity.setCourseId(entity.getCourseIds()[i]);
            courseTeaEntity.setTeacherId(entity.getTeaId());
            teaEntities.add(courseTeaEntity);
        }
        if (teaEntities.size() > 0) {
            courseTeaEntityMapper.insertBatch(teaEntities);
        }
        return teacherEntityMapper.insert(entity);
    }

    @PostMapping("/delete")
    public Integer delete(@RequestBody TeacherEntity entity) {
        return teacherEntityMapper.deleteByPrimaryKey(entity.getTeaId());
    }

    @PostMapping("/update")
    public Integer update(@RequestBody TeacherDTO entity) {
        CourseTeaEntityExample example = new CourseTeaEntityExample();
        example.or().andTeacherIdEqualTo(entity.getTeaId());
        //先清空后插入
        courseTeaEntityMapper.deleteByExample(example);
        List<CourseTeaEntity> teaEntities = new ArrayList<>();
        for (int i = 0; i < entity.getCourseIds().length; i++) {
            CourseTeaEntity courseTeaEntity = new CourseTeaEntity();
            courseTeaEntity.setCourseId(entity.getCourseIds()[i]);
            courseTeaEntity.setTeacherId(entity.getTeaId());
            teaEntities.add(courseTeaEntity);
        }
        if (teaEntities.size() > 0) {
            courseTeaEntityMapper.insertBatch(teaEntities);
        }
        return teacherEntityMapper.updateByPrimaryKey(entity);
    }

    @RequestMapping("/select")
    public Layui select(@RequestParam(required = false) String teaRealname, @RequestParam(value = "page") Integer page,
                        @RequestParam(value = "limit") Integer limit) {
        TeacherEntityExample example = new TeacherEntityExample();
        if (!StringUtils.isEmpty(teaRealname)) {
            example.or().andTeaRealnameLike("%"+teaRealname+"%");
        }
        Long cou = teacherEntityMapper.countByExample(example);
        return Layui.data(cou.intValue(), teacherEntityMapper.selectByExamplePaging(example, page - 1, limit));
    }

    @RequestMapping("/getTeacher")
    public TeacherDTO getAdmin(@RequestParam(value = "teaId") Integer teaId) {
        TeacherEntity entity = teacherEntityMapper.selectByPrimaryKey(teaId);
        CourseTeaEntityExample example = new CourseTeaEntityExample();
        example.or().andTeacherIdEqualTo(entity.getTeaId());
        List<CourseTeaEntity> courseTeaEntities = courseTeaEntityMapper.selectByExample(example);
        Integer[] arr = new Integer[courseTeaEntities.size()];
        for (int i = 0; i < courseTeaEntities.size(); i++) {
            arr[i] = courseTeaEntities.get(i).getCourseId();
        }
        TeacherDTO dto = new TeacherDTO();
        dto.setCourseIds(arr);
        dto.setLoginName(entity.getLoginName());
        dto.setLoginPw(entity.getLoginPw());
        dto.setTeaId(entity.getTeaId());
        dto.setDel(entity.getDel());
        dto.setTeaAge(entity.getTeaAge());
        dto.setTeaBianhao(entity.getTeaBianhao());
        dto.setTeaRealname(entity.getTeaRealname());
        dto.setTeaSex(entity.getTeaSex());
        return dto;
    }

    /**
     * 若存在--提示已经评论过
     *
     * @param teaId
     * @return
     */
    @RequestMapping("/exit")
    public Boolean exit(@RequestParam(value = "teaId") Integer teaId) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        //学生id
        Integer stuId = Integer.parseInt(session.getAttribute("loginUserId").toString());
        String loginType = session.getAttribute("loginUserType").toString();
        if (!StringUtils.endsWithIgnoreCase(UserTypeEnum.STUDENT.getCode(), loginType)) {
            return true;
        }
        PingjiaxinxiEntityExample example = new PingjiaxinxiEntityExample();
        example.or().andStuIdEqualTo(stuId).andTeaIdEqualTo(teaId);
        return pingjiaxinxiEntityMapper.selectByExample(example).size() > 0;
    }
}
