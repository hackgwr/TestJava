package com.itbaizhan;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//测试list接口的常用方法
public class ListTest {
    public static void main(String[] args) {
        //有序，可重复
//        listTest01();
//        listTest02();
        listTest03();
    }

    private static void listTest01() {
        List list = new ArrayList();
        System.out.println(list.isEmpty());//isEmpty()判断list是否为空
        list.add("巩文睿");
        System.out.println(list.isEmpty());
        System.out.println(list);
        list.add("gong");
        list.add("wen");
        list.add("rui");
        System.out.println(list);
        System.out.println("list的大小:" + list.size());//查询大小
        System.out.println("是否包含指定的元素:" + list.contains("gong"));//查询字段
        list.remove("gong");//移除字段
        System.out.println(list);

        Object[] student = list.toArray();//转换为数组
        System.out.println(Arrays.toString(student));

        list.clear();//清空
    }

    public static void listTest02() {
        //list存储的是有序，可重复
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        list.add(2, 0);//在某个位置添加元素
        System.out.println(list);

        list.remove(2);//删除某个位置的元素
        System.out.println(list);

        list.set(2,1);//设置某个位置的元素为
        System.out.println(list);

        System.out.println(list.get(2));//指定某个位置的元素作为返回值

        list.add("B");
        System.out.println(list);

        System.out.println(list.indexOf("B"));//从左往右查询
        System.out.println(list.lastIndexOf("B"));//从右往左查询
    }

    //测试两个容器的处理
    public static void listTest03(){
        List list1 = new ArrayList();
        list1.add("gong");
        list1.add("wen");
        list1.add("rui");
        list1.add("28");

        List list2 = new ArrayList();
        list2.add("巩");
        list2.add("文");
        list2.add("睿");
        list2.add("28");

        List list3 = new ArrayList();
        list3.add("gong");
        list3.add("wen");
        list3.add("rui");
        list3.add("28");

        System.out.println(list1.contains(list2));//比较两个容器的内容是否相同
        System.out.println(list1.containsAll(list3));//比较两个元素之间是否包含对方所有的元素

        list2.addAll(list3);//将list3加入进list2中
        System.out.println(list2);
        System.out.println(list3);

//        list2.removeAll(list3);//将list2中包含list3的元素移除，不论位置。
//        System.out.println(list2);
//        System.out.println(list3);

        list2.retainAll(list3);//取交集
        System.out.println(list2);
    }
}