package com.slp.springboot04web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author zixin
 * @Date 2020/5/26 12:38
 * @Version 1.0
 **/
@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    //@RequestMapping(value = "/user/login")
    public String  login(@RequestParam("username") String username,
                         @RequestParam("password") String password,
                         Map<String,Object> map){
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            return "dashboard";
        }else {
            map.put("msg","用戶名密碼錯誤");
            return "login";
        }

    }
}
