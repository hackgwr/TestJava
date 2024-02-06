package com.itbaizhan;
//规范代码要求：不管有没有发生异常，程序都可以关闭打开的这个流对象（文件）
//使用try,catch,finally的经典结构
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
//        readFile();
        writeFile();
    }

    //读取文件的写法
    public static void readFile() {
        FileInputStream fis = null;//文件读取或写入操作写在外面
        try {
            fis = new FileInputStream("C:/java/c.txt");

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
        } finally {
            try {
                if (fis != null) {
                    fis.close();//所有流对象在使用完毕之后必须关闭！！！ 不然会一直占用内存空间，造成系统崩溃
                }
                //close也需要进行try，catch
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //写入文件的写法
    public static void writeFile() {
        //此小节只测试中文不测试英文
        //中文以及其他语言需要用字符流进行测试，此小节为字节流测试
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:/java/d.txt");//如果原本没有这个文件则会新建

            fos.write('g');//写入g
            fos.write('a');//写入a
            fos.write('o');//写入o
        } catch (FileNotFoundException e) {//打开文件的时候需要进行try，catch
            e.printStackTrace();
        } catch (IOException e) {//进行IO流操作的时候需要进行try，catch
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                    //close也需要进行try，catch
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}