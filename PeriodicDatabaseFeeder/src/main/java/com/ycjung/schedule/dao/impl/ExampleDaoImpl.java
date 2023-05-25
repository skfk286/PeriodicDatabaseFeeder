package com.ycjung.schedule.dao.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ycjung.schedule.dao.ExampleDao;
import com.ycjung.schedule.vo.ExampleVo;

@Repository
public class ExampleDaoImpl implements ExampleDao {

    @Resource
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<ExampleVo> selectExample() {
        String sql = "SELECT SEQ, TEXT, SYSTEM_DATE FROM EXAMPLE";

        RowMapper<ExampleVo> rowMapper = (rs, rowNum) -> {
            Long seq = rs.getLong("SEQ");
            String text = rs.getString("TEXT");
            Date systemDate = new Date(rs.getTimestamp("SYSTEM_DATE").getTime());
            return new ExampleVo(seq, text, systemDate);
        };

        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public Integer insertExample(String text) {
        String sql = "INSERT INTO EXAMPLE (TEXT, SYSTEM_DATE) VALUES (?, ?)";
        return jdbcTemplate.update(sql, text, new Date());
    }
}
