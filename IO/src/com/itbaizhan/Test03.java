package com.itbaizhan;
//使用try,with,resource语法进行IO流的编写
//Test03的本质依旧是Test02

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        readFile();
        writeFile();
    }

    //读取文件的写法
    public static void readFile() {
        try (FileInputStream fis = new FileInputStream("C:/java/c.txt");){
            //流对象的创建和声明
            int s1 = fis.read();//read每次只读取一个字符
            int s2 = fis.read();
            int s3 = fis.read();
            int s4 = fis.read();
            int s5 = fis.read();
            int s6 = fis.read();

            System.out.println(s1);//不进行转型的话输出结果为97，是a对应的ASCⅡ码
            System.out.println((char) s1);//进行强制转型之后输出结果为a
            System.out.println((char) s2);//b
            System.out.println((char) s3);//c
            System.out.println((char) s4);//d
            System.out.println((char) s5);//d
            System.out.println(s6);//由于文件内容已经读取完毕，返回-1
        } catch (FileNotFoundException e) {//打开文件的时候需要进行try，catch
            e.printStackTrace();
        } catch (IOException e) {//进行IO流操作的时候需要进行try，catch
            e.printStackTrace();
        }//并不是finally和close没有了，而是编译器自动会进行生成
    }

    //写入文件的写法
    public static void writeFile() {
        //此小节只测试中文不测试英文
        //中文以及其他语言需要用字符流进行测试，此小节为字节流测试
        try (FileOutputStream fos = new FileOutputStream("C:/java/d.txt");){
            fos.write('g');//写入g
            fos.write('a');//写入a
            fos.write('o');//写入o
        } catch (FileNotFoundException e) {//打开文件的时候需要进行try，catch
            e.printStackTrace();
        } catch (IOException e) {//进行IO流操作的时候需要进行try，catch
            e.printStackTrace();
        }//并不是finally和close没有了，而是编译器自动会进行生成
    }
}
