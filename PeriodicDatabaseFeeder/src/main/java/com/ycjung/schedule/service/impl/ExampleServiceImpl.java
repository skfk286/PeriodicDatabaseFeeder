package com.ycjung.schedule.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ycjung.schedule.dao.ExampleDao;
import com.ycjung.schedule.service.ExampleService;
import com.ycjung.schedule.vo.ExampleVo;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Resource
    private ExampleDao exampleDao;

    @Override
    public List<ExampleVo> selectExample() {
        return exampleDao.selectExample();
    }
}
