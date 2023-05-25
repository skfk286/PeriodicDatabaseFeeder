package com.ycjung.schedule.service;

import java.util.List;

import com.ycjung.schedule.vo.ExampleVo;

public interface ExampleService {

    public List<ExampleVo> selectExample();
    
    public Integer insertExample(String text);
}
