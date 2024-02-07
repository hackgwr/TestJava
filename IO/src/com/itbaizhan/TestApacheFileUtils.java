package com.itbaizhan;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

//测试apache commons组件下的IO工具库
public class TestApacheFileUtils {
    public static void main(String[] args) {
//        writeFile();
//        readerFile();
        readURL();
    }


    public static void writeFile(){
        StringBuilder stb = new StringBuilder();
        for (int i = 0;i < 100;i++){
            stb.append(Math.random()+"\n");
        }

        try {
            FileUtils.write(new File("C:/java/java_test.txt"),stb.toString(),"gbk");
            //位置，传入的字符串，传入的格式
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readerFile(){
        try {
            List<String> content = FileUtils.readLines(new File("C:/java/java_test.txt"),"gbk");
            for (String temp:content){
                System.out.println(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readURL(){
        try {
            URL url = new URL("www.baidu.com");
            InputStream is = url.openStream();
            String content = IOUtils.toString(is,"UTF-8");

            System.out.println(content);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
