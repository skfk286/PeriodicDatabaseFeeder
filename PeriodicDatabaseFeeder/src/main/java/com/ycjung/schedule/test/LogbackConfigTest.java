package com.ycjung.schedule.test;

import java.util.Iterator;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;

public class LogbackConfigTest {
    
    public static void printAllAppenderConfigs() {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

        for (Logger logger : loggerContext.getLoggerList()) {
            Iterator<Appender<ILoggingEvent>> appenderIterator = logger.iteratorForAppenders();
            while(appenderIterator.hasNext()) {
                Appender<ILoggingEvent> appender = appenderIterator.next();
                if (appender instanceof RollingFileAppender) {
                    RollingFileAppender<ILoggingEvent> rollingAppender = (RollingFileAppender<ILoggingEvent>) appender;
                    TimeBasedRollingPolicy<?> rollingPolicy = (TimeBasedRollingPolicy<?>) rollingAppender.getRollingPolicy();
                    System.out.println("================================================================");
                    if (rollingPolicy != null) {
                        System.out.println("Max History of Appender [" + appender.getName() + ": " + rollingPolicy.getMaxHistory()+ "]");
                        //System.out.println("File Name Pattern of Appender [" + appender.getName() + ": " + rollingPolicy.getFileNamePattern() + "]");
                    } else {
                        //System.out.println("RollingPolicy is null for Appender [" + appender.getName() + "]");
                    }
                    PatternLayoutEncoder encoder = (PatternLayoutEncoder) rollingAppender.getEncoder();
                    if(encoder != null) {
                        //System.out.println("Pattern of Appender [" + appender.getName() + ": " + encoder.getPattern() + "]");
                    }
                    System.out.println("================================================================");
                }
            }
        }
    }
}
