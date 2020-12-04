package com.evaluation.controller;

import com.evaluation.entity.AdminEntity;
import com.evaluation.entity.AdminEntityExample;
import com.evaluation.mapper.AdminEntityMapper;
import com.evaluation.utils.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author: chg
 * @date: 2020/3/23 15:07
 * @Description:
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminEntityMapper adminEntityMapper;

    @PostMapping("/add")
    public Integer add(@RequestBody AdminEntity entity) {
        return adminEntityMapper.insert(entity);
    }

    @PostMapping(value = "/delete", consumes = "application/json")
    public Integer delete(@RequestBody AdminEntity entity) {
        return adminEntityMapper.deleteByPrimaryKey(entity.getUserid());
    }

    @PostMapping("/update")
    public Integer update(@RequestBody AdminEntity entity) {
        return adminEntityMapper.updateByPrimaryKey(entity);
    }

    @RequestMapping("/select")
    public Layui select(@RequestParam(required = false) String username,@RequestParam(value = "page")Integer page,
                        @RequestParam(value = "limit")Integer limit) {
        AdminEntityExample example = new AdminEntityExample();
        if (!StringUtils.isEmpty(username)){
            example.or().andUsernameLike("%"+username+"%");
        }
        example.getOrderByClause();
        Long cou = adminEntityMapper.countByExample(example);
        return Layui.data(cou.intValue(), adminEntityMapper.selectByExamplePaging(example, page-1, limit));
    }

    @RequestMapping("/getAdmin")
    public AdminEntity getAdmin(@RequestParam(value="userid")Integer userid) {
        return adminEntityMapper.selectByPrimaryKey(userid);
    }

}
