package com.itbaizhan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//测试边遍历边删除时候的操作
public class IteratorTest {
    public static void main(String[] args) {
//        test01();
//        test02();
        test03();
    }

    //使用for循环进行测试
    public static void test01(){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("bad");
        list.add("bag");

        //用for循环遍历并删除对象的时候会发生以下情况
        System.out.println(list);
        for(int i = 0;i < list.size();i++){
            String temp = list.get(i);
            if(temp.startsWith("b")){
                list.remove(i);
            }
        }
        System.out.println(list);
    }//以上情况的发生原因是因为在遍历并删除对象的时候虽然进行了遍历但是同时进行的删除导致size()发生了变化
     //所以删不干净


    //使用增强for循环进行测试，由于容器内部发生了变化所以出现了错误
    public static void test02(){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("bad");
        list.add("bag");

        System.out.println(list);
        for(String temp:list){
            if(temp.startsWith("b")){
                list.remove(temp);
            }
        }
        System.out.println(list);
    }

    //使用迭代器方法进行测试，能够删干净
    public static void test03() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("bad");
        list.add("bag");

        System.out.println(list);
        for (Iterator<String> iter = list.iterator();iter.hasNext();){
            String temp = iter.next();
            if(temp.startsWith("b")){
                iter.remove();
            }
        }
        System.out.println(list);
    }
}
