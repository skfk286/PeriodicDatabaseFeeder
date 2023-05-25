package com.ycjung.schedule.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleVo {
    private Long seq;
    private String text;
    private Date systemDate;
}