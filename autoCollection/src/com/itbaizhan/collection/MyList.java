package com.itbaizhan.collection;

import java.util.ArrayList;
import java.util.List;

//自定义Mylist接口，模仿的是，List接口
public interface MyList <E>{
    int size();//查询个数
    boolean isEmpty();//查询是否为空
    void add(E obj);//增加E并插入obj中，传的E是什么类型增加的就是什么类型
    public void add(int index,E obj);//在指定的索引位置添加一个值，值的类型为E，传的E是什么类型增加的就是什么类型
    public E set(int index,E obj);//将指定的索引位置替换为另一个值，值的类型为E，传的E是什么类型增加的就是什么类型
    public boolean contains(E obj);//有没有包含某个对象
    Object[] toArray();//转化为Object数组
    boolean remove(E obj);//将某个元素进行移除
    void remove(int index);
    void clear();//清空
    List list = new ArrayList();

    E get(int index);
}
