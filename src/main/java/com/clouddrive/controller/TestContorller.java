package com.clouddrive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ralphb
 * @version 1.0
 * @date 2019-04-29
 */
@Controller
public class TestContorller {
    @GetMapping("/test")
    public String home(){
        System.out.println("test");
        return "home";
    }
    @GetMapping("/index")
    public String index(){
        System.out.println("index");
        return "index";
    }
}
