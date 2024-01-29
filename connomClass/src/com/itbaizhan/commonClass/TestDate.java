package com.itbaizhan.commonClass;

import java.lang.ref.Cleaner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//测试时间相关的类
public class TestDate {
    public static void main(String[] args)  throws ParseException {
        //main也需要加 throws ParseException 抛出异常
//        test1();
//        test2();
        test3();
    }

    //测试Data类
    public static void test1(){
        long nowNum = System.currentTimeMillis();
        //返回当前时刻的毫秒数
        System.out.println(nowNum);

        Date d1 = new Date();//如果什么都不传的话就默认传入当前时间
        System.out.println(d1);

        Date d2 = new Date(1000L*3600*24*365*150);
        System.out.println(d2);//getTime() 用来获得毫秒数
    }


    //时间和字符串的转化，利用DateFormat的使用，时间和字符串之间的互相转化。
    public static void test2() throws ParseException {
        // throws ParseException 抛出异常
        DateFormat df = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        //使用SimpleDateFormat时需要指定相应的格式
        Date d2 = new Date(1000L*3600*24*365*150);
        String d3 = df.format(d2);
        System.out.println(d3);

        //将一个字符串以设置好的格式转化为时间对象
        String str1 = "19-11-26 09:00:00";
        Date d4 = df.parse(str1);
        System.out.println(d4);

        //获取今天是今年的第几天
        DateFormat day = new SimpleDateFormat("D");
        Date d5 = new Date();
        System.out.println(day.format(d5));

    }


    //日历类calendar
    public static void test3(){
        Calendar day = new GregorianCalendar();//公历，GregorianCalendar()不传值的话表示的是当前的时间
        //月份是按0-11来进行表示的，0=1月，1=2月，以此类推
        //星期是按照周日~周六来进行表示的，周日=1，周一=2以此类推
        Calendar day1 = new GregorianCalendar(2024,9,1,11,12,12);
        day1.get(Calendar.YEAR);

        int year = day1.get(Calendar.YEAR);
        int month = day1.get(Calendar.MONTH);
        System.out.println(year);
        System.out.println(month);

        day1.set(Calendar.YEAR,2024);
        System.out.println(day1.get(Calendar.YEAR));

        System.out.println(day1.getTime());
        System.out.println(day1.getTimeInMillis());

        //对日期的计算：
        day1.add(Calendar.YEAR,1000);
        System.out.println(day1.getTime());
        day1.add(Calendar.YEAR,-2000);
        System.out.println(day1.getTime());
    }
}
