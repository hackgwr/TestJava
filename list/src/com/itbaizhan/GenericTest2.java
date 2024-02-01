package com.itbaizhan;

import java.util.ArrayList;
import java.util.List;

//测试泛型2,通配符？ 和上下限定
public class GenericTest2 {
    public static void main(String[] args) {
        List<Animal> list1= new ArrayList<>();
        List<Dog> list2= new ArrayList<>();
        List<Taidi> list3= new ArrayList<>();

//        test01(list1);//限定符限定了传入的类型
        test01(list2);
        test01(list3);

        test02(list1);
        test02(list2);
//        test02(list3);//限定符限定了传入的类型
    }

    public static void test01(List<? extends Dog> list){
        //<? extends Dog>的意思是将Dog和子类Taidi放入类型中
        System.out.println(list);
    }

    public static void test02(List<? super Dog>list){
        //<? super Dog>的意思是将Dog和父类Animal放入类型中

    }

}

class Animal{

}

class Dog extends Animal{

}

class Taidi extends Dog{

}
