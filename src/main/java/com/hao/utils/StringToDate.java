package com.hao.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Describe com.hao.utils
 * @Auther wenhao chen
 * @CreateDate 2019/8/17
 * @Version 1.0
 *
 * 字符串转换日期，自定义转换器,一直报错，bad request。为啥？
 */
public class StringToDate implements Converter<String,Date> {

    @Override
    public Date convert(String s) {
        if (s == null) {
            throw new RuntimeException("请输入日期");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try{
            return df.parse(s);
        }catch (Exception e){
            throw new RuntimeException("日期转换错误");
        }
    }
}
