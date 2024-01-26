package com.itbaizhan.commonClass;

import java.util.Arrays;

//测试String类
public class TestString {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1(){
        //String类几种的定义方式
        String s1 = "abc";//凡是字符串常量都会放入字符串常量池
        String s2 = new String("abc");//建立了一个新的字符串对象，同字符串常量池之间以char进行链接
        String s3 = "abc";//凡是字符串常量都会放入字符串常量池
        String s4 = "aBC";//凡是字符串常量都会放入字符串常量池

        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
        System.out.println(s2==s3);//false
        //判断对象是否相同

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        //判断对象内部的值是否相同

        System.out.println(s1.equalsIgnoreCase(s4));
        //判断时忽略大小写

    }

    public static void test2(){
        String test1 = "0123456789,How are you,How old are you";
        System.out.println(test1.charAt(3));//索引位置3的字符
        //char charAt(int index) 返回字符串中第index个字符


        System.out.println(test1.length());//字符串长度
        //int length() 返回字符串的长度。


        char[] test2 = test1.toCharArray();
        //将字符串转化为数组
        System.out.println(Arrays.toString(test2));

        String[] test3 = test1.split(",");
        //可以传入正则表达式进行截取
        System.out.println(Arrays.toString(test3));


        System.out.println(test1.indexOf("are"));
        //判断是否包含子字符串,包含就返回索引位置，不包含就返回-1
        //从前找

        System.out.println(test1.lastIndexOf("are"));
        //判断是否包含子字符串,包含就返回索引位置，不包含就返回-1
        //从后找

        System.out.println(test1.contains("How"));
        //只进行判断不进行索引

        System.out.println(test1.startsWith("0123"));
        //判断是否以0123开头

        System.out.println(test1.endsWith("you"));
        //判断是否以you结尾




    }

    public static void test3(){
        String Test3 = "0123456789,How are you";
        String Test4 = Test3.replace(' ','&');
        System.out.println(Test3);
        System.out.println(Test4);
        //将字符串中的' '所包含的内容替换为'&'
        //Test4是通过Test3生成的全新的字符串，与Test3是不一样的。

        Test4 = Test3.substring(4);
        System.out.println(Test4);
        //从4开始进行字符串的截取

        Test4 = Test3.substring(4,10);
        System.out.println(Test4);
        //从4开始到10结束（不包含10的位置，属于[4,10)）进行字符串的截取

        Test4 = Test3.toLowerCase();
        System.out.println(Test4);
        //将字符串中的元素全部改为小写，同理如下
        Test4 = Test3.toUpperCase();
        System.out.println(Test4);
        //将字符串的元素全部改为大写

        String Test6 = "  How old are you   ";
        Test4 = Test6.trim();
        System.out.println(Test4);
        //去除首尾的空格，在一些特殊情况比如进行注册的登录时id和pwd格式的时候使用
    }
}
