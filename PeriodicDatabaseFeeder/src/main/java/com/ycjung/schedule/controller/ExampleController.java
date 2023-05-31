package com.ycjung.schedule.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ycjung.schedule.constants.Default;
import com.ycjung.schedule.service.ExampleService;
import com.ycjung.schedule.test.LogbackConfigTest;
import com.ycjung.schedule.vo.ExampleVo;

@RestController
public class ExampleController implements InitializingBean{

    private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);
    
    @Resource
    private ExampleService exampleService;
    
    @RequestMapping(value = "/test.do")
    public List<ExampleVo> test() {
        logger.debug("{} ▶▶▶▶▶ /test.do ▶▶▶▶", Default.LOG_KEY);
        return exampleService.selectExample();
    }
    
    @RequestMapping(value = "/print.do")
    public String test2() {
        logger.debug("{} ▶▶▶▶▶ /test2.do ▶▶▶▶", Default.LOG_KEY);
        
        LogbackConfigTest.printMaxHistoryForAllAppenders();
        
        return "hello world!!!";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.debug("{} ▶▶▶▶▶ InitializingBean ExampleController ▶▶▶▶", Default.LOG_KEY);
    }
}
