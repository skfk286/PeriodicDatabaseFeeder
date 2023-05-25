package com.ycjung.schedule.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ycjung.schedule.constants.Default;

@Configuration
public class JdbcTemplateConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(JdbcTemplateConfiguration.class);
    
    @Autowired
    private final DataSource dataSource;

    @Autowired
    public JdbcTemplateConfiguration(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        
        if(logger.isDebugEnabled()) {
            logger.debug("{} Initializing JdbcTemplate : [{}]", Default.LOG_KEY, jdbcTemplate);
        }
        
        return jdbcTemplate;
    }
}
