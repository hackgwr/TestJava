package com.itbaizhan;
//测试泛型1

import javax.naming.NamingEnumeration;
import javax.security.auth.login.CredentialNotFoundException;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//测试泛型的基本用法
public class GenericTest1 {
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        List<String> list = new ArrayList<>();
        //<>里定义泛型，<>中只能是引用类型。不能用基本数据类型

        //泛型类的实现Integer
        Generic1<Integer> g1 = new Generic1<>();
        g1.aa(22);

        //泛型类的实现String
        Generic1<String> g2 = new Generic1<>();
        g2.aa("22");
    }
}

//定义一个简单的泛型类
class Generic1<T>{
    public T aa(T obj){
        System.out.println(obj);
        return obj;
    }

    //方法的泛型
    public <N> void bb(N obj){
        System.out.println(obj);
    }
}

//接口的泛型
interface Mylist<E>{
    int size();
    boolean isempenty();
    void add(E e);
    E get(int index);
}

class MyArrayList<E> implements Mylist<E> {


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isempenty() {
        return false;
    }

    @Override
    public void add(E e) {

    }

    @Override
    public E get(int index) {
        return null;
    }
}
