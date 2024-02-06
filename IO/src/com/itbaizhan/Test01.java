package com.itbaizhan;

import java.io.FileInputStream;
import java.io.*;

//仅用于测试，代码不规范
public class Test01 {
    public static void main(String[] args) {
//        readFile();
        writeFile();
    }

    //测试读取文件内容
    public static void readFile(){
        try {
            FileInputStream fis = new FileInputStream("C:/java/b.txt");

            int s1 = fis.read();//read每次只读取一个字符
            int s2 = fis.read();
            int s3 = fis.read();
            int s4 = fis.read();
            int s5 = fis.read();
            int s6 = fis.read();

            System.out.println(s1);//不进行转型的话输出结果为97，是a对应的ASCⅡ码
            System.out.println((char)s1);//进行强制转型之后输出结果为a
            System.out.println((char)s2);//b
            System.out.println((char)s3);//c
            System.out.println((char)s4);//d
            System.out.println((char)s5);//d
            System.out.println(s6);//由于文件内容已经读取完毕，返回-1

            fis.close();//所有流对象在使用完毕之后必须关闭！！！ 不然会一直占用内存空间，造成系统崩溃

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    //测试写入文件内容
    public static void writeFile(){
        //此小节只测试中文不测试英文
        //中文以及其他语言需要用字符流进行测试，此小节为字节流测试
        try {
            FileOutputStream fos = new FileOutputStream("C:/java/d.txt");//如果原本没有这个文件则会新建

            fos.write('g');//写入g
            fos.write('a');//写入a
            fos.write('o');//写入o

            fos.close();//关闭文件(必须)

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
