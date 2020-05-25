package com.slp.springboot04web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(){
        return "hello";
    }

    /**
     * 查出一些数据，在页面展示
     * @return
     */
    @RequestMapping("/success")
    public  String success(Map<String,Object> map){
        map.put("hello","你好");
        map.put("users", Arrays.asList("zang","wang"));
        return "success";
    }
}
