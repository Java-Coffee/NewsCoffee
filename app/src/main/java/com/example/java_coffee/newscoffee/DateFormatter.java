package com.example.java_coffee.newscoffee;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Java-Coffee on 2017/4/11.
 */
public class DateFormatter {
    /**
     * 将long类date转换为String类型
     * @param date date
     * @return String date
     */
    public String ZhihuDailyDateFormat(long date) {
        String sDate;
        Date d = new Date(date + 24*60*60*1000);
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        sDate = format.format(d);
        return sDate;
    }
    public String DoubanDateFormat(long date){
        String sDate;
        Date d = new Date(date);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        sDate = format.format(d);
        return sDate;
    }
}
