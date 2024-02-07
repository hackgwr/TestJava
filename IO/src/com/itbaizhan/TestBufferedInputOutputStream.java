package com.itbaizhan;
//测试缓冲字节流：BufferedInputStream和BufferedOutputStream
import java.io.*;

public class TestBufferedInputOutputStream {
    public static void main(String[] args) {
        testBufferedInputOutputStream("C:/java/checklist.png","C:/java/checklist_copy.png");

    }

    public static void testBufferedInputOutputStream(String from,String to){
        try (
                FileInputStream fis = new FileInputStream(from);
                FileOutputStream fos = new FileOutputStream(to);
                BufferedInputStream bis = new BufferedInputStream(fis);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ){
            int temp = 0;
            while ((temp = fis.read())!=-1){
                bos.write(temp);//调用缓存数组
//                fos.write(temp);//不调用缓存数组
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}