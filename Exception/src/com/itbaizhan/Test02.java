package com.itbaizhan;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//try catch finally
public class Test02 {
    public static void main(String[] args) throws ParseException {
        test1();
        test2();
        test3();
        System.out.println(test4());
    }

    //测试try catch finally
    public static void test1(){
        FileReader a = null;
        try {
            a = new FileReader("C:/a.txt");
            char c1 = (char)a.read();
            char c2 = (char)a.read();
            System.out.println(c1);
            System.out.println(c2);
            System.out.println("字母为；"+c1+c2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (a!=null){
                try {
                    a.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //测试throws,声明式抛出异常
    public static void test2() throws ParseException {
        DateFormat df = new SimpleDateFormat("yy-MM-dd");
        String str = "2049-10-1";
        Date d = df.parse(str);
        System.out.println(d);
    }

    //try-with-resource,可以自动关闭实现了AutoClosable接口的类
    //可以将test1的try-catch-finally简化为try-catch
    public static void test3(){
        try(FileReader a = new FileReader("C:/a.txt")){
            char c1 = (char)a.read();
            char c2 = (char)a.read();
            System.out.println(c1);
            System.out.println(c2);
            System.out.println("字母为；"+c1+c2);
            System.out.println(c1+c2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }//编译器碰到Test3的结构时候会自动转化成Test1的结构，这是一种语法糖

    public static int test4(){
        int a = 10;
        System.out.println("step1");
        try{
            System.out.println("step2");
            a = 20;
            return a;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            a = 40;
            System.out.println("step3");
            return a;
            //如果finally里有return的话就执行finally里的return，没有的话就执行try里的return
        }

    }

}
