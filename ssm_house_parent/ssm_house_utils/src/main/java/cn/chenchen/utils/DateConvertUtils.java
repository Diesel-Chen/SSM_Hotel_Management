package cn.chenchen.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertUtils {

    //日期转字符串
    public static String DateToString(Date source,String patt){
        DateFormat df = new SimpleDateFormat(patt);
        return df.format(source);
    }
}
