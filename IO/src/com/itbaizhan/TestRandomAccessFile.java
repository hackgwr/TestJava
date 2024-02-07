package com.itbaizhan;
//随意访问文件流
//1.实现对一个文件读和写的操作。2，可以访问文件的任意位置。不像其他流需要按照先后顺序进行访问
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) {
        try (
                RandomAccessFile raf = new RandomAccessFile("C:/java/data02.txt","rw")
                ){
            int[] data = {10,20,30,40,50,60,70,80,90,100};
            for(int i = 0;i < data.length;i++){
                raf.writeInt(data[i]);//写入数据
            }
            //直接从data02.txt中读取数据，位置比如说从第4个字节开始
            raf.seek(4);//从第四个字节开始读
            // 由于int的一个数据占用四个字节，所以从第四个开始是20这个元素，以此类推，8就是30，12就是40.....
            System.out.println(raf.readInt());
            //遍历全部内容
            for (int i = 0;i<raf.length();i = i + 4){
                raf.seek(i);
                System.out.print(raf.readInt()+"\t");
            }
            System.out.println();

            //写入数据
            raf.seek(4);
            raf.writeInt(45);//将字节数为4的位置的元素替换为45，20---->>45

            raf.seek(4);
            System.out.println(raf.readInt());
            for (int i = 0;i<raf.length();i = i + 4){
                raf.seek(i);
                System.out.print(raf.readInt()+"\t");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
