package com.itbaizhan;
//测试数据流TestDataInputStream和TestDataOutputStream
//用来处理基本数据类型和字符串
//数据源：基本数据类型与字符串类型

import java.io.*;

public class TestDataInputOutputStream {
    public static void main(String[] args) {
        testDataOutputStream();
        testDataInputStream();
    }

    public static void testDataOutputStream(){
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/java/data.txt"))){
            dos.writeChar('a');
            dos.writeInt(10);
            dos.writeDouble(Math.random());//随机数字
            dos.writeBoolean(true);
            dos.writeUTF("程序员");//字符串类型
            //手动刷新缓冲区，将流中的数据写入文件中
            dos.flush();


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void testDataInputStream(){
        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:/java/data.txt"))){
            //读取的时候，读取顺序需要和写入顺序保持一致！！！否则不能正确的进行数据的读取
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
