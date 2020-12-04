package com.evaluation.controller;

import com.evaluation.entity.IndexTableEntity;
import com.evaluation.entity.IndexTableEntityExample;
import com.evaluation.mapper.IndexTableEntityMapper;
import com.evaluation.utils.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: chg
 * @date: 2020/3/23 21:50
 * @Description:
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/first")
public class IndexController {

    @Autowired
    private IndexTableEntityMapper indexTableEntityMapper;


    @PostMapping("/add")
    public Integer add(@RequestBody IndexTableEntity entity) {
        if (StringUtils.isEmpty(entity.getParentId())) {
            entity.setParentId(null);
        }
        return indexTableEntityMapper.insert(entity);
    }

    @PostMapping(value = "/delete", consumes = "application/json")
    public Integer delete(@RequestBody IndexTableEntity entity) {
        return indexTableEntityMapper.deleteByPrimaryKey(entity.getId());
    }

    @PostMapping("/update")
    public Integer update(@RequestBody IndexTableEntity entity) {
        return indexTableEntityMapper.updateByPrimaryKey(entity);
    }

    @RequestMapping("/select")
    public Layui select(@RequestParam(required = false) String indexname, @RequestParam(value = "page") Integer page,
                        @RequestParam(value = "limit") Integer limit) {
        IndexTableEntityExample example = new IndexTableEntityExample();
        IndexTableEntityExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(indexname)) {
            criteria.andIndexnameLike("%"+indexname+"%");
        }
        criteria.andParentIdIsNotNull();
        Long cou = indexTableEntityMapper.countByExample(example);
        return Layui.data(cou.intValue(), indexTableEntityMapper.selectByExamplePaging(example, page - 1, limit));
    }

    @RequestMapping("/selectFir")
    public List<IndexTableEntity> selectFir() {
        IndexTableEntityExample example = new IndexTableEntityExample();
        example.or().andParentIdIsNull();
        return indexTableEntityMapper.selectByExample(example);
    }

    @RequestMapping("/selectList")
    public List<IndexTableEntity> selectList() {
        IndexTableEntityExample example = new IndexTableEntityExample();
        example.or().andParentIdIsNotNull();
        return indexTableEntityMapper.selectByExample(example);
    }

    @RequestMapping("/getFirst")
    public IndexTableEntity getAdmin(@RequestParam(value = "id") Integer userid) {
        return indexTableEntityMapper.selectByPrimaryKey(userid);
    }
}
