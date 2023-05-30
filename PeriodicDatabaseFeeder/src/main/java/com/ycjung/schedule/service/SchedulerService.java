package com.ycjung.schedule.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.ycjung.schedule.constants.Default;

@Service
public class SchedulerService {
    
    private static final Logger logger = LoggerFactory.getLogger(SchedulerService.class);
    
    @Resource ExampleService exampleService;
    
    @Scheduled(cron = "*/20 * * * * ?")
    public void run() {
        String msg = "Hello World!";
        //exampleService.insertExample(msg);
        logger.debug("{} {}", Default.LOG_KEY, msg);
    }
    
    @Scheduled(cron = "0 0 */2 * * ?")
    public void everyTwoHoursEvent() {
        // TODO: 여기에 코드 작성 (매일 2시간 마다 실행될 작업)
        String msg = "Go for it!";
        exampleService.insertExample(msg);
        logger.debug("{} {}", Default.LOG_KEY, msg);
    }
    
    
    @Scheduled(cron = "0 0 9 * * ?")
    public void dailyEvent() {
        // TODO: 여기에 코드 작성 (매일 아침 9시에 실행될 작업)
        String msg = "Good morning";
        exampleService.insertExample(msg);
        logger.debug("{} {}!", Default.LOG_KEY, msg);
    }
    
    @Scheduled(cron = "0 0 12 * * ?")
    public void dailyNoonEvent() {
        // TODO: 여기에 코드 작성 (매일 점심 12시에 실행될 작업)
        String msg = "Enjoy your launch";
        exampleService.insertExample(msg);
        logger.debug("{} {}!", Default.LOG_KEY, msg);
    }

    @Scheduled(cron = "0 0 19 * * ?")
    public void dailyEveningEvent1() {
        // TODO: 여기에 코드 작성 (매일 저녁 7시에 실행될 작업)
        String msg = "Enjoy your dinner";
        exampleService.insertExample(msg);
        logger.debug("{} {}!", Default.LOG_KEY, msg);
    }

    @Scheduled(cron = "0 0 23 * * ?")
    public void dailyEveningEvent2() {
        // TODO: 여기에 코드 작성 (매일 저녁 11시에 실행될 작업)
        String msg = "Have a good dream";
        exampleService.insertExample(msg);
        logger.debug("{} {}!", Default.LOG_KEY, msg);
    }
}
