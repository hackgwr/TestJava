package com.itbaizhan;
//测试字符流FileReader和FileWrite
//数据源：文件
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileReaderWriter {
    public static void main(String[] args) {
        testFileReaderWriter("C:/java/e.txt","C:/java/e_copy.txt");
    }

    public static void testFileReaderWriter(String srcpath,String destpath){
        try (FileInputStream fis = new FileInputStream(srcpath);
        FileOutputStream fos = new FileOutputStream(destpath);){
//            int temp = 0;
            byte[] bytes = new byte[1024];
            while (fis.read(bytes)!= -1){
//                fis.read(bytes)!= -1
//                (temp =  fis.read())!= -1
//                fos.write(temp);
                fos.write(bytes);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
