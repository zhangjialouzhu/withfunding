package com.yuc.with_boot.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String getFormatDate(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);
        return dateStr;
    }


}
