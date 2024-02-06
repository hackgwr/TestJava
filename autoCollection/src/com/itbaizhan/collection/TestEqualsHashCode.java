package com.itbaizhan.collection;

import java.util.Objects;

public class TestEqualsHashCode {
}

class Cat{
    int id;
    String name;


    //equals和hashcode通常需要一起进行重写
    //如果A和B的equals为true，那么hashcode也必须相等(主要是为了HashMap,如果不这么规定，HashMap在存储的时候会出现悖论)
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;//如果对象相等直接返回true
        if (object == null || getClass() != object.getClass()) return false;//如果等于空或者类型不相等直接返回false
        Cat cat = (Cat) object;//如果类型都为Cat类型
        return id == cat.id;//则判断id值是否相等，如果相等返回true，不同就返回false
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
