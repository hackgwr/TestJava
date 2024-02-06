package com.itbaizhan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//流的使用，经典代码
public class Test04 {
    public static void main(String[] args) {
//        readFile01();
//        readFile02();
//        writeFile();
//        copyFile("C:/java/clipboard.png","C:/java/clipboard_copy.png");
    }

    //读取文件的经典语法try-catch-finally
    public static void readFile01(){
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:/java/b.txt");
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            while ((temp = fis.read()) != -1){
                //当temp不等于-1，则继续循环，当等于-1时候，则已到了文件的结尾，结束循环
                sb.append((char) temp);
            }
            System.out.println(sb);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //读取文件的经典语法try-catch-resource
    public static void readFile02(){
        try(FileInputStream fis = new FileInputStream("C:/java/b.txt")){
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            while ((temp = fis.read()) != -1){
                //当temp不等于-1，则继续循环，当等于-1时候，则已到了文件的结尾，结束循环
                sb.append((char) temp);
            }
            System.out.println(sb);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //写入文件的写法
    public static void writeFile() {
        //此小节只测试中文不测试英文
        //中文以及其他语言需要用字符流进行测试，此小节为字节流测试
        try (FileOutputStream fos = new FileOutputStream("C:/java/d.txt");){
//            fos.write('g');//写入g
//            fos.write('a');//写入a
//            fos.write('o');//写入o
            fos.write("gao".getBytes());
        } catch (FileNotFoundException e) {//打开文件的时候需要进行try，catch
            e.printStackTrace();
        } catch (IOException e) {//进行IO流操作的时候需要进行try，catch
            e.printStackTrace();
        }//并不是finally和close没有了，而是编译器自动会进行生成
    }

    //文件的拷贝,效率最低的原始版本：读一个写一个
    public static void copyFile(String srcpath,String destpath){
//        try (FileInputStream fis = new FileInputStream("C:/java/clipboard.png");
//             FileOutputStream fos = new FileOutputStream("C:/java/clipboard_copy.png");){
        //将以上操作进行封装
        try (FileInputStream fis = new FileInputStream(srcpath);
             FileOutputStream fos = new FileOutputStream(destpath);){
            int temp = 0;
            while ((temp = fis.read())!=-1){
                fos.write(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //使用缓存提高拷贝效率
    public static void copyFileBuffered(String srcpath,String destpath){

        try (FileInputStream fis = new FileInputStream(srcpath);
             FileOutputStream fos = new FileOutputStream(destpath);){

            byte[] buffer = new byte[1024];
            int temp = 0;
            while (fis.read(buffer)!=-1){
                fos.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
