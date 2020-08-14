package com.slp.forme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/14 13:47
 * @Version 1.0
 **/
@RestController(value = "test")
public class TestController {
    @GetMapping(value = "test")
    public String getTest(HttpServletRequest request, HttpServletResponse response){
        return "test";
    }
}
