package com.itbaizhan;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

//测试set,set的特点：无序，不可重复
public class SetTest {
    public static void main(String[] args) {
//        test01();
        test02();
    }

    //Set的常用方法
    public static void test01(){
        Set s = new HashSet();
        s.add("gong");
        s.add("wen");
        s.add("rui");
        s.add("rui");//相同的元素不会再次被加入
        System.out.println(s);
        System.out.println(s.isEmpty());//isEmpty()判断set是否为空
        System.out.println(s.size());//查询大小
        System.out.println("是否包含指定的元素:" + s.contains("gong"));//查询字段
        Object[] student = s.toArray();//转换为数组
        System.out.println(Arrays.toString(student));
        s.clear();
        System.out.println(s);//清空
        //其他的方法和list一致，因为Set和List都是Collection接口的子接口
    }

    //Set不可重复的核心，equals方法
    public static void test02(){
        Emp  e1 = new Emp(1001,"gong");
        Emp  e2 = new Emp(1002,"wen");
        Emp  e3 = new Emp(1001,"rui");

        Set s1 = new HashSet();
        s1.add(e1);
        s1.add(e2);
        s1.add(e3);
        //当加入e3的时候会调用equals进行比较，由于id相同，则判断发生了重复，则不添加e3
        System.out.println(s1);
    }
}

class Emp{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //如果传进来的值与o相同的话返回true
        if (o == null || getClass() != o.getClass()) return false;
        //如果传进来是空，且类型也不同的话返回false
        Emp emp = (Emp) o;
        //如果类型一样的话
        return id == emp.id;//且id相等的话，返回true
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //构造器
    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //set get方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
