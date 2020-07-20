package cn.chenchen.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String2DateConverter2 implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if(source==null){
            throw new RuntimeException("日期不能为空!");
        }
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        try {
            return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("类型转换出错!");
        }
    }
}
