package com.itbaizhan;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//测试字节数组流：ByteArrayInputStream和ByteArrayOutputStream
// 数据源是内存中的“某个字节数组对象”
public class TestByteArrayInputOutputStream {
    public static void main(String[] args) {
        testByteArrayInputOutputStream("abcdefg".getBytes());
        //getBytes()可以把字符串转化成字节数组
    }

    public static void testByteArrayInputOutputStream(byte[] bytes){
        int temp = 0;
        int num = 0;//用于表示读取的字节数
        try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);){
            while ((temp = bis.read()) != -1){
                System.out.print((char) temp+"\t");
                num++;
            }
            System.out.println("读取结束的字符数是："+num);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
