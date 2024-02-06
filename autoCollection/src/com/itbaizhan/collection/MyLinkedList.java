package com.itbaizhan.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Optional;

//测试双向List
public class MyLinkedList<E> implements MyList<E> {
    private int size;
    private Node first;//第一个节点
    private Node last;//最后一个节点



    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");

        Node n = list.node(2);
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
        rangeCheck(index);
        Node temp = node(index);//找到传进来的位置

        Node newNode = new Node();//创建新的节点
        newNode.obj = obj;//新节点内的obj等于传进来的obj

        if(temp != null){
            //新增节点为newNode，上一个节点为up，下一个节点为temp
            Node up = temp.previous;//定义一个新的节点up，up为原本旧的上一个节点。
            //原本下一个节点的头部temp.previous是指向上个节点up的，在up和temp之间添加新的元素newNode
            //也可以写成temp = up.next;
            up.next = newNode;//将新节点up的next指向新元素newNode
            newNode.previous = up;//将新节点newNode的previous指向上一个节点up

            newNode.next = temp;//将新节点newNode的next指向下一个节点temp
            temp.previous = newNode;//将下一个节点temp的previous指向新节点newNode
            //完成了在在up和temp之间添加新的元素newNode
        }
        size++;//将个数+1
    }

    @Override
    public E set(int index, E obj) {
        rangeCheck(index);

        Node temp = node(index);
        temp.obj = obj;
        return obj;
    }

    @Override
    public boolean contains(E obj) {
        for (int i=0;i<size;i++){
            if (node(i).obj.equals(obj)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[size];
        for (int i = 0;i<size;i++){
            objects[i] = node(i).obj;
        }
        return objects;
    }

    @Override
    public boolean remove(E obj) {
        for (int i=0;i<size;i++){
            if (node(i).obj.equals(obj)){
                remove(i);
                return true;
            }
        }size--;
        return false;
    }

    //做指定位置的移除操作
    @Override
    public void remove(int index) {
        rangeCheck(index);
        Node temp = node(index);//首先找到我们要索引处的元素node(index)
        //需要去除的节点为temp，temp的上一个节点为up，temp的下一个节点为down

        if (temp!=null){
            Node up = temp.previous;//将所要去除的节点temp的previous指向up
            Node down = temp.next;//将所要去除的节点temp的next指向down

            up.next = down;//再将up的next指向down
            down.previous = up;//将down的previous指向up

            size--;//将个数-1
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i=0;i<size;i++){
            sb.append(node(i).obj+"\t");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void clear() {
        for (int i=0;i<size;i++){
            remove(i);
        }
    }

    @Override
    public E get(int index) {
        return (E)node(index).obj;//(E)为强制转型
    }

    //将索引位置判断进行一个封装
    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {//添加的合法区间为[0,(size-1)]
            try {
                throw new Exception("位置不合法");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }//索引位置是否合法的判断
    }

    //传进来一个编号，然后找到对应的节点
    private Node node(int index){
        rangeCheck(index);//判断索引位置是否合法
        Node temp = null;
        //进行二分法判断，如果index的值处于链表的前方，就从后往前找，如果处于链表的后方就从前往后找。
        if (first != null){//是否为空进行判断
            if (index<size>>1){
                //左移相当于乘2，右移相当于除2
                // 这里的判断为if (index<size/2),就相当于size右移1，就等于if (index<size>>1)
                //这里使用位运算的左移与右移，运算符号为:<<或>>。
                temp = last;
                for (int i = size-1;i<index;i--){//从后面往前找
                    temp = temp.previous;
                }
            }
            temp = first;
            for (int i=0;i<index;i++){//从前面往后找
                temp = temp.next;
            }
        }
        return temp;//如果等于空就直接返回temp
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
