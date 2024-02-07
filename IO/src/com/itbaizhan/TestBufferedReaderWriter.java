package com.itbaizhan;
//测试缓冲字符流：BufferedReader和BufferWrite
//数据源：文件
import java.io.*;

public class TestBufferedReaderWriter {
    public static void main(String[] args) {
        testBufferedReaderWriter("C:/java/e.txt","C:/java/e_copy03.txt");
    }

    public static void testBufferedReaderWriter(String from,String to){
        try (
//                FileReader fr = new FileReader(from);
//                FileWriter fw = new FileWriter(to);
                BufferedReader br = new BufferedReader(new FileReader(from));
                BufferedWriter bw = new BufferedWriter(new FileWriter(to));
        ){
            String tempString;
            while ((tempString = br.readLine())!=null){
                //由于是readLine是一行一行的进行读取，所以不包括换行符，我们这里需要进行手动换行
                bw.write(tempString);
//                bw.write(tempString+"\n"+"nmsl");//在进行文本文件copy的时候也可以添加文字进去
                bw.newLine();    //手动换行,没有手动换行的话就会将一整列数据copy成一整行
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
