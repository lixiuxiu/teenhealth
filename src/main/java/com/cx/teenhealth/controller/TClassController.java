package com.cx.teenhealth.controller;

import com.cx.teenhealth.bean.TClass;
import com.cx.teenhealth.mapper.TClassMapper;
import com.cx.teenhealth.service.TClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class TClassController {

    @Autowired
    private TClassService tClassService;
    @Autowired
    private TClassMapper tClassMapper;

    @RequestMapping("test")
    @ResponseBody
    public List<TClass> test() {
        return tClassService.findAllTClass();
    }
    @RequestMapping("test2")
    @ResponseBody
    public List<TClass> test2() {
        return tClassMapper.selectTClasses();
    }

    @RequestMapping("student")
    public String page() {
        return "student";
    }

    @RequestMapping("bodyFell")
    public String bodyFell() {
        return "bodyFell";
    }

    @RequestMapping("trainingProgram")
    public String trainingProgram() {
        return "trainingProgram";
    }

    @RequestMapping("class")
    public String classes() {
        return "class";
    }
    @RequestMapping("setting")
    public String setting() {
        return "setting";
    }

    @RequestMapping("user")
    public String user() {
        return "user";
    }

    @RequestMapping("operation")
    public String operation() {
        return "operation";
    }




}
