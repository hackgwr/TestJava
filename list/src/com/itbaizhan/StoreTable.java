package com.itbaizhan;
//使用容器的不同方式，储存表格信息

import java.time.Instant;
import java.time.InstantSource;
import java.util.*;
import java.util.List;

public class StoreTable {
    public static void main(String[] args) {
//        test01();
        test02();

    }

    //使用map存储
    public static void test01(){
        //代表了一整行的信息
        Map<String, Object> m1 = new HashMap<>();
        m1.put("id",1001);
        m1.put("title","我爱java");
        m1.put("createDate","2021-8-10");
        m1.put("length",300);

        Map<String, Object> m2 = new HashMap<>();
        m2.put("id",1002);
        m2.put("title","我爱百战");
        m2.put("createDate","2021-9-10");
        m2.put("length",400);

        Map<String, Object> m3 = new HashMap<>();
        m3.put("id",1003);
        m3.put("title","我来编程");
        m3.put("createDate","2021-10-10");
        m3.put("length",500);

        //储存了整个表格的信息
        List<Map<String,Object>> list = new ArrayList();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        System.out.println(list);

        //用for循环进行遍历
        System.out.println("用for循环进行遍历");
        for (int i = 0;i<list.size();i++){
            Map<String, Object> m = list.get(i);
            //用for循环时，将list重新放入一个map，再通过map进行表格元素的查询
            System.out.println(list.get(i));
            System.out.println(m.get("id"));
        }

        //用增强for循环进行遍历
        System.out.println("用增强for循环进行遍历");
        for (Map<String,Object> i:list){
            System.out.println(i);
            System.out.println(i.get("id"));
        }

        //用迭代器的方法进行遍历
        System.out.println("用迭代器的方法进行遍历");
        Iterator<Map<String,Object>> iterator = list.iterator();
        //使用增强for循环进行遍历
        System.out.println("使用增强for循环进行遍历");
        for (Map<String,Object> i:list){
            System.out.println(i);
            System.out.println(i.get("id"));
        }

        //使用while循环进行遍历
        System.out.println("使用while循环进行遍历");
        while (iterator.hasNext()){
            Map<String,Object> a = iterator.next();
            System.out.println(a);
            System.out.println(a.get("id"));
        }
    }

    //List和Javabean()的方式
    public static void test02(){
        VideoInfo v1 = new VideoInfo(1001,"我爱java","2021-8-10",300);
        VideoInfo v2 = new VideoInfo(1001,"我爱百战","2021-8-10",400);
        VideoInfo v3 = new VideoInfo(1001,"我来编程","2021-10-10",500);

        List<VideoInfo> list = new ArrayList<>();
        list.add(v1);
        list.add(v2);
        list.add(v3);
        System.out.println(list);
        //直接打印的结果是三个元素的地址值，如果要打印实际元素的情况需要重写toString方法。
        //修改打印结果的格式，式样也可以直接通过修改toString方法进行。
        //修改某一个值的输出式样，也只需要修改“get值”的return值即可

        //用for循环进行遍历
        System.out.println("用for循环进行遍历");
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));//获取某一行的所有
            System.out.println(list.get(i).getId());//获取某一特定数值
            System.out.println(list.get(i).getLength());

        }

        //使用增强for循环进行遍历
        System.out.println("使用增强for循环进行遍历");
        for (VideoInfo i:list){
            System.out.println(i);//获取某一行的所有
            System.out.println(i.getId());//获取某一特定数值
        }

        //用迭代器的方法进行遍历
        System.out.println("用迭代器的方法进行遍历");
        Iterator<VideoInfo> iterator = list.iterator();
        //使用增强for循环进行遍历
        System.out.println("使用增强for循环进行遍历");
        for (VideoInfo i:list){
            System.out.println(i);//获取某一行的所有
            System.out.println(i.getId());//获取某一特定数值
        }

        //使用while循环进行遍历
        System.out.println("使用while循环进行遍历");
        while (iterator.hasNext()){
            VideoInfo i = iterator.next();
            System.out.println(i);//获取某一行的所有
            System.out.println(i.getId());//获取某一特定数值
        }
    }
}

class VideoInfo{
    private int id;
    private String title;
    private String createDate;
    private int length;

    @Override
    public String toString() {
        return "id=" + id +
                ", title='" + title + '\'' +
                ", createDate='" + createDate + '\'' +
                ", length=" + length;
    }

    //构造器
    //定义一个无参构造器
    public VideoInfo(){

    }
    //定义有参数的构造器
    public VideoInfo(int id, String title, String createDate, int length) {
        this.id = id;
        this.title = title;
        this.createDate = createDate;
        this.length = length;
    }

    //定义get set方法，
    //对get方法的修改可以修改获得参数的式样或结构
    //对set方法的修改可以修改设置参数的式样或结构
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
