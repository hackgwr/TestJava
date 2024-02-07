package com.itbaizhan;
//转换流：InputStreamReader和OutputStreamWrite
//数据源：字节流

import java.io.*;

public class TestInputStreamReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             //键盘输入，输入字节流，将字节流转化成字符流
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
             //输出：将字符流转化为字节流
//             BufferedWriter bw = new BufferedWriter(new FileWriter("C:/java/putin.txt"))
        ){
            String str = br.readLine();
            while (!"exit".equals(str)){
                bw.write("键盘输入为："+str);
                bw.newLine();
                bw.flush();

                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
