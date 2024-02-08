package com.itbaizhan;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileFilter;
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
//        readURL();
//        FileCopy();
        directoryCopy();
    }

    //写入
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

    //读取
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

    //获取网页信息
    public static void readURL(){
        try {
            URL url = new URL("http://www.google.co.jp/");//返回的是html源码
            //如果发生报错，错误为：
            // java.net.MalformedURLException: no protocol: www.google.co.jp/
            //需要在网址前面加http://
            InputStream is = url.openStream();
            String content = IOUtils.toString(is,"UTF-8");

            System.out.println(content);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //拷贝
    public static void FileCopy(){
        File srcfile = new File("C:/java/java_test.txt");
        File destFile = new File("C:/java/java_test01.txt");
        try {
            FileUtils.copyFile(srcfile,destFile);
            FileUtils.copyFileToDirectory(srcfile,new File("C:/java/test/"));
            //将一个文件拷贝到某个目录下方，如果没有这个目录即创建目录，如果文件重复则覆盖文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //将一个目录的文件拷贝到另一个目录中
    public static void directoryCopy(){
        File dir1 = new File("C:/java");
        File dir2 = new File("C:/java/test/");

        try {
            FileUtils.copyDirectory(dir1, dir2, new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    //return true;
                    //false的时候什么也不拷贝
                    //true的时候全部拷贝
                    //如果想要拷贝某一类型的全部文件，需要添加判断
                    if (pathname.isDirectory()||pathname.getName().endsWith("txt")){
                        //如果为目录，或者后缀名为txt的文件，就进行拷贝
                        return true;
                    }
                    return false;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
