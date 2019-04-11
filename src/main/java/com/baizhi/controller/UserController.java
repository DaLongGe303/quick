package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("u")
    @ResponseBody
    public String select(){
        System.out.println("---------3333-----");
        return "333333333";
    }
}
