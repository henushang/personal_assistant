package com.henushang.pa.converter;

import java.util.Date;

import org.springframework.core.convert.converter.Converter;

import com.henushang.pa.util.DateUtil;

public class StringToDateConverter implements Converter<String, Date> {

    public Date convert(String time) {
        return DateUtil.toDate(time);
    }

}
