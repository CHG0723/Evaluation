package com.evaluation.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: chg
 * @date: 2020/3/23 16:03
 * @Description:
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class PageController {
    @RequestMapping("/{path}")
    public String intoJsp(@PathVariable String path){
        return path;
    }

    @RequestMapping("/intoTeacherStep")
    public String intoTeacher_step(){

        return "step_teacher";
    }
}
