package com.itbaizhan;

import java.util.*;

//测试map的使用方法。
// map：通常用来存储键值对，实现一对一的对应(key----value)，以键进行标识，所以键值不可重复。
//map是无序，不可重复的，这里的不可重复特指键不可重复，值是可以重复的
public class MapTest {
    public static void main(String[] args) {
        test01();
        test02();
        iterateList();
        iterateSet();
        iterateMap();

    }


    //Map的常用方法
    public static void test01(){
        Map m1 = new HashMap();//new HashTable
        //常用方法put
        m1.put(1,"one");//map中存储的是对象，这里的1不是int而是Integer.valueof() ，如下
//        m1.put(Integer.valueOf(1),"one");
        m1.put(2,"two");
        m1.put(3,"three");
        m1.put(4,"three");//键不可重复，值可以重复
        m1.put(2,"二");
        //测试直接再在2键值中加入value，输出结果为新添加的value直接覆盖了之前的value

//        System.out.println(m1.get(1));
        Object obj = m1.get(2);
        System.out.println(obj);

        //map的常用方法
        System.out.println(m1.size());//键值对的数量
        System.out.println(m1.isEmpty());//判断是否为空
        System.out.println(m1.containsKey(1));//判断m1中的键是否包含1这个键
        System.out.println(m1.containsValue("one"));//判断m1中的值是否包含one这个值
        m1.remove(3);//从Map容器中移除键值对
        System.out.println(m1);

        Map m2 = new HashMap<>();
//        Map<> m2 = new HashMap<>();
//        java6以下需要加入<>并添加键和值的类型，java7以上则不需要，<>可以省略
        m2.put("yi","1111");
        m2.put("er","2222");
        m2.put(3,"3333");
        System.out.println(m2);
        m1.putAll(m2);//将Map m2的全部键值对放入Map m1中
        System.out.println(m1);
    }

    //泛型的简单用法
    public static void test02(){
        List<String> list = new ArrayList();
        //<>标签中定义哪一种类型，list中就只能存放哪一种类型，严格的限制了存取时候的内容
        //无标签的话就是什么内容都可以放

        Set<String> set = new HashSet();//Set同理

        Map<String,Integer> map = new HashMap<>();//Map需要定义键和值的存储类型
    }

    //容器List的遍历
    public static void iterateList(){//list和set的遍历方法差不多
        List<String> list01 = new ArrayList<>();
        list01.add("gong");
        list01.add("wen");
        list01.add("rui");
        System.out.println(list01);
        //使用for循环遍历List
        System.out.println("使用for循环遍历List");
        for (int i=0;i<list01.size();i++){
            String temp = list01.get(i);
            System.out.println(temp);
        }

        //使用增强型for循环遍历List
        System.out.println("使用增强型for循环遍历List");
        for (String i : list01){
            System.out.println(i);
        }

        //使用迭代器循环遍历List
        System.out.println("使用迭代器循环遍历List");
        Iterator<String> iterator = list01.iterator();
        //使用增强型for循环遍历
        for(String i:list01){
            System.out.println(i);
        }
        //使用while循环遍历
        while (iterator.hasNext()) {
            String a = iterator.next();
            System.out.println(a);
        }
    }


    //容器Set的遍历
    public static void iterateSet(){
        Set<String> set01 = new HashSet<>();
        set01.add("gong");
        set01.add("wen");
        set01.add("rui");
        System.out.println(set01);

        //由于Set没有索引，所以我们不能使用for循环遍历Set，但是可以用增强for循环或迭代器的方法遍历set
        //可以将set的内容放入数组再进行for循环遍历
        System.out.println("使用for循环遍历Set生成的数组");
        for (int i=0;i<set01.size();i++){
            Object[] object = set01.toArray();
            System.out.println(object[i]);
        }

        //使用增强型for循环遍历Set
        System.out.println("使用增强型for循环遍历Set");
        for (String i:set01){
            System.out.println(i);
        }

        //使用迭代器循环遍历Set
        System.out.println("使用迭代器循环遍历Set");
        Iterator<String> iterator = set01.iterator();
        //使用增强型for循环遍历
        System.out.println("使用增强型for循环遍历");
        for(String b:set01){
            System.out.println(b);
        }
        //使用while循环遍历
        System.out.println("使用while循环遍历");
        while (iterator.hasNext()) {
            String a = iterator.next();
            System.out.println(a);
        }
    }

    //容器Map的遍历
    public static void iterateMap(){
        Map<String,String> map01 = new HashMap<>();
        map01.put("one","yi");
        map01.put("two","er");
        map01.put("three","san");
        Set<String> mp1= map01.keySet();
        System.out.println(mp1);//将Map中的元素放入新建立的Set中，之后可以用增强for循环或者迭代器进行遍历

        //使用增强型for循环遍历
        System.out.println("使用增强型for循环遍历Set");
        for (String i:mp1){
            System.out.println(i);//获取键
            System.out.println(map01.get(i));//获取值
        }

        //使用迭代器循环遍历
        System.out.println("使用迭代器循环遍历Set");
        Iterator<String> iterator = mp1.iterator();
        //使用增强型for循环遍历
        System.out.println("使用增强型for循环遍历");
        for(String b:mp1){
            System.out.println(b);//获取键
            System.out.println(map01.get(b));//获取值
        }
        //使用while循环遍历
        System.out.println("使用while循环遍历");
        while (iterator.hasNext()) {
            String a = iterator.next();
            System.out.println(a);//获取键
            System.out.println(map01.get(a));//获取值
        }

        Collection<String> coll = map01.values();
        System.out.println("使用增强型for循环遍历Set");
        for (String i:coll){
            System.out.println(i);//获取值
        }

        //同时获取键值,利用EntrySet这个特殊类型遍历键值对
        Set<Map.Entry<String,String>> entrySet = map01.entrySet();
        System.out.println("使用增强型for循环遍历Set");
        for (Map.Entry i:entrySet){
            System.out.println(i);//获取值
        }
    }
}


