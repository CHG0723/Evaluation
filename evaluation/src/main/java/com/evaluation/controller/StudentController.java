package com.evaluation.controller;

import com.alibaba.fastjson.JSONObject;
import com.evaluation.entity.StudentEntity;
import com.evaluation.entity.StudentEntityExample;
import com.evaluation.mapper.StudentEntityMapper;
import com.evaluation.utils.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author: chg
 * @date: 2020/3/23 15:40
 * @Description:
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentEntityMapper studentEntityMapper;

    @PostMapping("/add")
    public Integer add(@RequestBody StudentEntity entity) {
        return studentEntityMapper.insert(entity);
    }

    @PostMapping("/delete")
    public Integer delete(@RequestBody StudentEntity entity) {
        return studentEntityMapper.deleteByPrimaryKey(entity.getStuId());
    }

    @PostMapping("/update")
    public Integer update(@RequestBody StudentEntity entity) {
        return studentEntityMapper.updateByPrimaryKey(entity);
    }


    @RequestMapping("/select")
    public Layui select(@RequestParam(required = false) String stuRealname, @RequestParam(value = "page") Integer page,
                        @RequestParam(value = "limit") Integer limit) {
        StudentEntityExample example = new StudentEntityExample();
        if (!StringUtils.isEmpty(stuRealname)){
            example.or().andStuRealnameLike("%"+stuRealname+"%");
        }
        Long cou = studentEntityMapper.countByExample(example);
        return Layui.data(cou.intValue(), studentEntityMapper.selectByExamplePaging(example, page - 1, limit));
    }

    @RequestMapping("/getStudent")
    public StudentEntity getAdmin(@RequestParam(value="stuId")Integer stuId) {
        return studentEntityMapper.selectByPrimaryKey(stuId);
    }
}
