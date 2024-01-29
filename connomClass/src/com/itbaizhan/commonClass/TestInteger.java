package com.itbaizhan.commonClass;
import java.util.Arrays;
//测试包装类
public class TestInteger {
    //long------->long类,int------->integer类
    public static void main(String[] args) {
        testCache();
    }
    public static void testInteger(){
        //基本数据类型转化成integer对象的
        Integer int1 = Integer.valueOf(100);

        //把包装类对象转换为基本数据类型
        int int2 = int1.intValue();
        long long1 = int1.longValue();

        //把字符串转化为Integer对象
        Integer str1 = Integer.parseInt("123");//这里必须全都是数字
        System.out.println(str1);

        System.out.println(str1.toString());//将包装类转化为字符串
        String str2 = new String();
        str2 = str1.toString();
        System.out.println(str2);

        int int3 = int1.intValue();
        int3 = Integer.MAX_VALUE;//最大
        System.out.println(int3);
        int3 = Integer.MIN_VALUE;//最小
        System.out.println(int3);

        //同理
        long long2 = int1.longValue();
        long2 = Long.MAX_VALUE;
        System.out.println(long2);
        long2 = Long.MIN_VALUE;
        System.out.println(long2);
    }

    //自动装箱，拆箱
    public static void testAutoBox(){
        Integer a = 100;  //编译器自动添加代码，自动装箱，同等于Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);

        //自动拆箱，拆箱的时候要确保内容不是空的，否则会发生空指针异常
        int c = a;        //编译器自动添加代码，自动拆箱，同下
        int d = a.intValue();
    }


    //包装类的缓存问题
    public static void testCache(){
        //整形，char形在自动装箱的时候，会自动对-128~127之间的值进行缓存处理
        Integer a = Integer.valueOf(100);
        Integer b = 100;
        System.out.println(a == b);//是同一个对象

        Integer c = 127;
        Integer d = 127;
        System.out.println(c == d);//当在127以内时是同一个对象
        //在127以内的数字属于Integer原本的缓存区间，直接从缓存区间中取

        Integer e = 128;
        Integer f = 128;
        System.out.println(e == f);//当在127以外时不是同一个对象
        //在127以外的数字不属于Integer原本的缓存区间，需要建立新的对象






    }
}
