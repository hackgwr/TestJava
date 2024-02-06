package com.itbaizhan.collection;

import java.util.Arrays;
import java.util.HashMap;

//手工实现的HashMap
public class MyHashMap<K,V> implements MyMap<K,V>{
    //HashMap map;

    private static final int INITIAL_CAPACITY = 16;//一般将数组个数设置为16
//    private static final int INITIAL_CAPACITY = 2;//这里为了测试，将数组个数设置为2

    private int size;
    private Entry[] table;

    public static void main(String[] args) {
        MyMap<String,String> myHashMap = new MyHashMap<>();
        System.out.println(myHashMap);
        myHashMap.put("a","AAA");
        myHashMap.put("b","BBB");
        myHashMap.put("c","CCC");
        myHashMap.put("d","DDD");
        myHashMap.put("a","ABCDEF");

        String val = myHashMap.get("a");
        System.out.println(val);

        myHashMap.toString();
        System.out.println(myHashMap);

        myHashMap.remove("a");
        System.out.println(myHashMap);
        myHashMap.remove("c");
        System.out.println(myHashMap);





    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //[{a:123,b:456.....},{a:123.c:234........}]
        sb.append("[");
        for (Entry e:table){
            while (e!=null){
                sb.append("{"+e.key+":"+e.value+"},");//输出为[{b:BBB},{d:DDD},{a:ABCDEF},{c:CCC},]
                e = e.next;
            }
        }
        sb.deleteCharAt(sb.length()-1);// 删除最后的逗号
        sb.append("]");
        return sb.toString();
    }

    public MyHashMap(){
        table = new Entry[INITIAL_CAPACITY];//初始化table，长度就是刚刚定义好的INITIAL_CAPACITY，为16
    }


    @Override
    public void put(K key, V value) {
        int index =  hash(key);
        Entry entry = new Entry(key,value,index,null);
        //就将K key, V value这个对象放入了entry中
        if (table[index] == null){
            table[index] = entry;
        }else {
            Entry e = table[index];
            Entry last = e;
            while (e != null){
                if (e.key.equals(key)){
                    e.value = value;//如果key相等，则直接覆盖value
                    return;
                }
                //如果不相等
                last = e;//保存最后一个
                e = e.next;
            }//上面整个循环结束，如果没有return，则说明整个单向链表中没有Entry对象的key与传入的key相等
            //则添加Entry到链表的最后
            last.next = entry;
        }
        size++;
    }

    @Override
    public V get(K key) {
        int index = hash(key);
        if (table[index] != null){
        //如果传进来的值不为空则进行以下判断
            Entry e = table[index];
            while (e != null){
                if(e.key.equals(key)){
                    return (V) e.value; //如果key相等则返回对应的value
                }
                e = e.next;
            }
        }
        return null;//如果传进来的值为空则直接返回null
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public void remove(K key) {
        int index = hash(key);
        if ( table[index]!= null){
            Entry e = table[index];
            Entry previous = null;//定义上一个节点，如果没有上一个节点，则为null
            while (e!=null){
                if (e.key.equals(key)){
                    if (previous == null){//如果没有上一个节点，key所在的节点就是第一个节点，只有一个元素
                        table[index] = e.next;//将她的下一个节点前移，放到链表的最前面
                    }else {
                        //说明有多个节点
                        previous.next = e.next;
                        //跳过当前节点，将当前节点的后面的节点与前一个连接起来
                        size--;
                    }
                }
                previous = e;
                e = e.next;//继续寻找下一个节点
            }
        }



    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    //将获取hash值的操作进行封装，以便后续进行调用
    private int hash(Object key){
        int hashcode = key.hashCode();//返回的是int，有可能是负数
        hashcode = hashcode<0?-hashcode:hashcode;//取绝对值
        //三目运算符：关系表达式 ？ 表达式1 ： 表达式2
        //关系表达式的值为true时取表达式1的值；关系表达式的值为false时取表达式2的值。

//        int index = hashcode/hashcode;
//        //最差的算法，将HashMap直接变成了单向的链表
//        int index = hashcode%table.length;
//        //将所取到的hashcode取余，余数为HashMap的哈希值，早期的jdk就是这样的算法
//        //现如今则使用位运算
        return hashcode&(table.length-1);
        //将hashcode与table.length-1进行按位与运算，得到一个新的整数值。
        //其结果会产生一个[0,length-1]的一个数字
    }
}

class Entry<K,V>{
    K key;
    V value;
    int hash;
    Entry next;

    public Entry() {

    }

    public Entry(K key, V value, int hash, Entry next) {
        this.key = key;
        this.value = value;
        this.hash = hash;
        this.next = next;
    }
}
