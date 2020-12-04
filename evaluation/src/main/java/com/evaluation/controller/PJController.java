package com.evaluation.controller;

import com.evaluation.dto.PJDTO;
import com.evaluation.entity.PingjiaxinxiEntity;
import com.evaluation.entity.PingjiaxinxiEntityExample;
import com.evaluation.entity.StudentEntity;
import com.evaluation.entity.TeacherEntity;
import com.evaluation.enums.UserTypeEnum;
import com.evaluation.mapper.PingjiaxinxiEntityMapper;
import com.evaluation.mapper.StudentEntityMapper;
import com.evaluation.mapper.TeacherEntityMapper;
import com.evaluation.utils.Layui;
import com.evaluation.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: chg
 * @date: 2020/3/25 20:36
 * @Description: 评价信息控制类
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/pj")
public class PJController {

    @Autowired
    PingjiaxinxiEntityMapper pingjiaxinxiEntityMapper;
    @Autowired
    private StudentEntityMapper studentEntityMapper;
    @Autowired
    private TeacherEntityMapper teacherEntityMapper;

    @RequestMapping("/add")
    public Result insert(@RequestParam(value = "teacherId") Integer teacherId,
                         @RequestParam(value = "lastResult") Integer lastResult) {
        try {

            PingjiaxinxiEntity entity = new PingjiaxinxiEntity();
            entity.setShijian(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            entity.setTeaId(teacherId);
            entity.setZongfen(lastResult);
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session = request.getSession();
            String userId = session.getAttribute("loginUserId").toString();
            String loginUserType = session.getAttribute("loginUserType").toString();
            entity.setStuId(Integer.parseInt(userId));
            PingjiaxinxiEntityExample entityExample = new PingjiaxinxiEntityExample();
            entityExample.or().andTeaIdEqualTo(teacherId).andStuIdEqualTo(Integer.parseInt(userId));
            Long result = pingjiaxinxiEntityMapper.countByExample(entityExample);
            System.out.println("评价用户身份："+loginUserType);
            if (result > 0) {
                return Result.ofSuccess(loginUserType);
            }
            pingjiaxinxiEntityMapper.insertSelective(entity);
            return Result.ofSuccess(loginUserType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.ofError(5001,"评价失败");
    }

    @RequestMapping("/listLayui")
    public Layui listLayui(@RequestParam(value = "page") Integer page,
                           @RequestParam(value = "limit") Integer limit) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        PingjiaxinxiEntityExample entityExample = new PingjiaxinxiEntityExample();
        String loginUserId = session.getAttribute("loginUserId").toString();
        String loginUserType = session.getAttribute("loginUserType").toString();
        //如果登录用户为a教师  只能看到他自己的评价信息
        if (loginUserType.equals(UserTypeEnum.TEACHER.getCode())) {
            entityExample.or().andTeaIdEqualTo(Integer.parseInt(loginUserId));
        }
        Long count = pingjiaxinxiEntityMapper.countByExample(entityExample);
        List<PingjiaxinxiEntity> entities = pingjiaxinxiEntityMapper.selectByExamplePaging(entityExample, page, limit);
        List<PJDTO> pjdtoList = new ArrayList<>();
        entities.forEach(o -> {
            PJDTO pjdto = new PJDTO();
            pjdto.setId(o.getId());
            TeacherEntity teacherEntity = teacherEntityMapper.selectByPrimaryKey(o.getTeaId());
            StudentEntity studentEntity = studentEntityMapper.selectByPrimaryKey(o.getStuId());
            pjdto.setStudentName(studentEntity == null ? "" : studentEntity.getStuRealname());
            pjdto.setTeacherName(teacherEntity == null ? "" : teacherEntity.getTeaRealname());
            pjdto.setShijian(o.getShijian());
            pjdto.setZongfen(o.getZongfen());
            pjdtoList.add(pjdto);
        });
        return Layui.data(count.intValue(), pjdtoList);
    }
}
