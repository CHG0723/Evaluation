package com.evaluation;

import com.evaluation.entity.AdminEntityExample;
import com.evaluation.mapper.AdminEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class EvaluationApplicationTests {

    @Autowired
    private AdminEntityMapper adminEntityMapper;
    @Test
    public void contextLoads() {
        AdminEntityExample entityExample = new AdminEntityExample();
        entityExample.or().andUsernameLike("%adm%");
        log.info("返回：{}", adminEntityMapper.selectByExample(entityExample));

    }

}
