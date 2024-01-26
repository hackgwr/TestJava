package com.itbaizhan.commonClass;

import java.util.Arrays;

//测试可变字符序列的用法,及内存测试
public class TestStringBuilder {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
    public static void test1(){
        String s = "";
        StringBuilder sb1 = new StringBuilder();
        StringBuffer sb2 = new StringBuffer();

        //append添加字符
        sb1.append("a");
        sb1.append("b");
        sb1.append("c").append("d").append("e");
        System.out.println(sb1);

        sb2.append("a");
        sb2.append("b");
        sb2.append("c").append("d").append("e");
        System.out.println(sb2);

        //从某个位置添加字符
        sb1.insert(0,"gong ");
        sb1.insert(4," wen");
        sb1.insert(8,"i").insert(8,"u").insert(8," r");
        System.out.println(sb1);

        //从a位置删除至b字符,a必须小于b，从左到右删除，[a,b)
        sb1.delete(0,5);
        System.out.println(sb1);

        //指定位置删除
        sb1.deleteCharAt(0);
        System.out.println(sb1);

        sb1.deleteCharAt(0).deleteCharAt(2).deleteCharAt(1);
        System.out.println(sb1);

        //字符串逆序
        sb1.reverse();
        System.out.println(sb1);
    }

    public static void test2(){
        //使用String进行字符串的拼接
        String str = "";
        long num1 = Runtime.getRuntime().freeMemory();//获取JVM剩余内存空间单位是字节
        long time1 = System.currentTimeMillis();//获取当前的时刻，单位是毫秒
        for (int i=0;i<1000;i++){
            str += i;
        }
        long num2 = Runtime.getRuntime().freeMemory();//获取JVM剩余内存空间单位是字节
        long time2 = System.currentTimeMillis();//获取当前的时刻，单位是毫秒
        System.out.println(str);
        System.out.println("占用内存空间"+(num1-num2)+"字节\n用时"+(time2-time1)+"毫秒");
    }


    public static void test3(){
        //使用StringBuilder进行字符串的拼接
//        String str = "";
        StringBuilder sb = new StringBuilder();
        long num3 = Runtime.getRuntime().freeMemory();//获取JVM剩余内存空间单位是字节
        long time3 = System.currentTimeMillis();//获取当前的时刻，单位是毫秒
        for (int i=0;i<1000;i++){
            sb.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();//获取JVM剩余内存空间单位是字节
        long time4 = System.currentTimeMillis();//获取当前的时刻，单位是毫秒
        System.out.println(sb);
        System.out.println("占用内存空间"+(num3-num4)+"字节\n用时"+(time4-time3)+"毫秒");
    }


    public static void test4(){
        //使用StringBuffer进行字符串的拼接
        StringBuffer sb = new StringBuffer();
        long num3 = Runtime.getRuntime().freeMemory();//获取JVM剩余内存空间单位是字节
        long time3 = System.currentTimeMillis();//获取当前的时刻，单位是毫秒
        for (int i=0;i<5000;i++){
            sb.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();//获取JVM剩余内存空间单位是字节
        long time4 = System.currentTimeMillis();//获取当前的时刻，单位是毫秒
        System.out.println(sb);
        System.out.println("占用内存空间"+(num3-num4)+"字节\n用时"+(time4-time3)+"毫秒");
    }
}
