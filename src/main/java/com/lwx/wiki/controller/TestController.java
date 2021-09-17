package com.lwx.wiki.controller;

import com.lwx.wiki.domain.Test;
import com.lwx.wiki.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World！";
    }

    @RequestMapping("/hello/posr")
    public String helloPost(String name){
        return "Hello World! Post" + name;
    }

    @RequestMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
