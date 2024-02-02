package com.itbaizhan.collection;

import java.util.Iterator;
import java.util.LinkedList;

//测试双向List
public class MyLinkedList<E> implements MyList<E> {
    private int size;
    private Node first;//第一个节点
    private Node last;//最后一个节点



    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size==0){
            return true;
        }
        return false;
    }

    //在双向List中添加新的元素
    @Override
    public void add(E obj) {
        Node n = new Node();
        if (first == null){
            //增加第一个节点
            n.setPrevious(null);//表中没有第一个节点所以first为null
            n.setObj(obj);//添加obj的值
            n.setNext(null);//表中的下一个节点也为空所以last为null

            //first指向第一个节点，由于只有一个，所以last也指向第一个
            first = n;
            last = n;
        }else{
            n.setPrevious(last);//表中有数据所以头节点指向之前的最后一个节点last
            n.setObj(obj);//添加obj的值
            n.setNext(null);//由于是添加在末尾所以尾节点为null

            last.setNext(n);
            last = n;
        }
        size++;
    }

    @Override
    public void add(int index, E obj) {

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
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    private Node node(int index){
        Node temp = null;
        //进行二分法判断，如果index的值处于链表的前方，就从后往前找，如果处于链表的后方就从前往后找。
        if (first != null){
            if (index<size>>1){
                //这里使用位运算的左移与右移，运算符号为:<<或>>。
                temp = last;
                for (int i = size-1;i<index;i--){
                    temp = temp.previous;
                }
            }
            temp = first;
            for (int i=0;i<index;i++){
                temp = temp.next;
            }
        }
        return temp;
    }
}

class Node{
    Node previous;  //上一个节点
    Node next;      //下一个节点
    Object obj;     //需要进行存储的信息

    //带参数的构造器
    public Node(Node previous, Node next, Object obj) {
        this.previous = previous;
        this.next = next;
        this.obj = obj;
    }

    //无参数的构造器
    public Node(){

    }

    //set get方法
    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
