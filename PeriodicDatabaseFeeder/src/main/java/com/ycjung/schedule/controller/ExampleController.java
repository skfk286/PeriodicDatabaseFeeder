package com.ycjung.schedule.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ycjung.schedule.service.ExampleService;
import com.ycjung.schedule.vo.ExampleVo;

@RestController
public class ExampleController {

    @Resource
    private ExampleService exampleService;
    
    @RequestMapping(value = "/test.do")
    public List<ExampleVo> test() {
        
        return exampleService.selectExample();
    }
}
