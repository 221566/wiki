package com.lwx.wiki.controller;

import com.lwx.wiki.domain.Demo;
import com.lwx.wiki.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
