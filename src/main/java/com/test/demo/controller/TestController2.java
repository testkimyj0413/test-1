package com.test.demo.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@Profile("prd")
public class TestController2 {


    @RequestMapping("/info")
    public String info(){
        return "app-1-prd";
    }
}
