package com.itbaizhan.collection;

import java.util.ArrayList;

public class MyArrayList<E> implements MyList<E>{
    public static void main(String[] args) {
        //定义容器的时候就可以对容器大小进行定义
        MyArrayList<String> list= new MyArrayList<>(10);
        System.out.println(list);

        list.add("100");
        list.add("101");
        list.add("102");
        list.add("103");
        list.add("104");
        list.add("105");
//        list.add("106");
//        list.add("107");
//        list.add("108");
//        list.add("109");
//        list.add("110");
//        list.add("111");
//        list.add("112");
//        list.add("113");
//        list.add("114");
//        list.add("115");
//        list.add("116");
        System.out.println(list);

    }

    private int size;
    private Object[] elementDate;

    //初始化容量大小的构造器
    public MyArrayList(){
        this(10);
    }

    //对传入的容量大小进行判断
    public MyArrayList(int initialCapacity){
        //判断
        if(initialCapacity<0){
            try {
                throw new Exception("容器的初始化个数不能为负数");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementDate = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(E obj) {
//        if(size == elementDate.length){//判断如果size已经等于elementDate.length的话则需要进行数组elementDate的扩容操作
//            Object[] newArray = new Object[elementDate.length^2];
//            //建立新的数组newArray，newArray的大小为原elementDate数组的自乘(可自行设置)。
//            //先将原本数组的内容拷贝到新的数组之中
//            System.arraycopy(elementDate,0,newArray,0, elementDate.length);
//            //System.arraycopy是将一个数组的内容拷贝到另一个数组之中，使用方法如下
//            //System.arraycopy(原数组，从哪一位开始拷贝，新数组，从哪一位开始拷贝，拷贝的个数);
//            elementDate = newArray;
//        }

        //调用扩容方法
        ensureCapacity();
        //将新的值拷贝进新的数组中，类型为E泛型
        elementDate[size] = obj;
        //再将size扩大一位
        size++;
    }

    @Override
    public void add(int index, E obj) {
//        if (index < 0||index >= size) {//添加的合法区间为[0,(size-1)]
//            try {
//                throw new Exception("添加的位置不合法");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }//索引位置是否合法的判断

        //将索引位置判断进行一个封装
        index(index);

        //如果已经放满了元素，则进行扩容
        //调用扩容方法
        ensureCapacity();

        System.arraycopy(elementDate,index,elementDate,index+1,size-index);
        //实现了将elementDate数组的index位置向后移动一个位置，再进行添加
        elementDate[index] = obj;
        size++;
    }

    @Override
    public E set(int index, E obj) {
        return null;
    }

    @Override
    public boolean contains(E obj) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(E obj) {
        return false;
    }

    @Override
    public void clear() {

    }

    //将扩容操作进行一个封装
    private void ensureCapacity(){
        if(size == elementDate.length){//判断如果size已经等于elementDate.length的话则需要进行数组elementDate的扩容操作
            Object[] newArray = new Object[elementDate.length^2];
            //建立新的数组newArray，newArray的大小为原elementDate数组的自乘(可自行设置)。
            //先将原本数组的内容拷贝到新的数组之中
            System.arraycopy(elementDate,0,newArray,0, elementDate.length);
            //System.arraycopy是将一个数组的内容拷贝到另一个数组之中，使用方法如下
            //System.arraycopy(原数组，从哪一位开始拷贝，新数组，从哪一位开始拷贝，拷贝的个数);
            elementDate = newArray;
        }
    }

    //将索引位置判断进行一个封装
    private void index(int index){
        if (index < 0||index >= size) {//添加的合法区间为[0,(size-1)]
            try {
                throw new Exception("添加的位置不合法");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }//索引位置是否合法的判断
    }
}
