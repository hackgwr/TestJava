package com.itbaizhan.collection;
//自定义实现的HashSet
public class MyHashSet {
    MyHashMap map;
    private static final Object PRESENT = new Object();

    public MyHashSet(){
        map = new MyHashMap();
    }

    public int size(){
        return map.size();
    }

    public void add(Object obj){
        map.put(obj,PRESENT);
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add("aa");
        set.add("bb");
        set.add("cc");
    }
}
