package com.itbaizhan;
//try,catch 以及常见的异常处理
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) {
//        test01();
//        test02();
        test03();
    }

    public static void test01(){
        System.out.println("111");
//        int a = 1/0;
        System.out.println("222");
    }

    public static void test02(){
        System.out.println("111");
        //ctrl+alt+t 增加try/catch
        try {
            int a = 1/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("222");
    }



    //数字异常处理
    public static void test03(){
        int a = 1;
        int b = 0;
//        System.out.println(a/b);
        if(b!=0){
            System.out.println(a/b);
        }


        //空指针 NullPointException
        String str = null;
        if(str!=null){
            System.out.println(str.charAt(2));
        }

        String str2 = "234ABC";
//        int c = Integer.parseInt(str2);//将一串字符串转化为int类型
//        System.out.println(c);

        Pattern p = Pattern.compile("^[0-9]+$");//正则判断
        Matcher m = p.matcher(str2);
        if(m.matches()){
            System.out.println(Integer.parseInt(str2));
        }else System.out.println("数字格式不对");



        //数组下标越界
        int[] c = new int[3];
        int d = 3;
        if(d >= 0 && d > c.length){
            System.out.println(c[c.length]);
        }
        System.out.println("超出数组长度");



        //类型转化异常 ClassCastException
        Animal am = new Dog();
        if (am instanceof Cat){
            Cat cat = (Cat) am;
            System.out.println(cat);
        }else {
            System.out.println("数据类型异常");
        }
    }
}


class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}
