package com.lwx.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World！";
    }

    @RequestMapping("/hello/posr")
    public String helloPost(String name){
        return "Hello World! Post" + name;
    }
}
