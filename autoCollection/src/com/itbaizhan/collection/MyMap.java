package com.itbaizhan.collection;
//自定义Map接口
public interface MyMap<K,V> {
    public void put(K key,V value);
    public V get(K key);
    public boolean containsKey(K key);
    public boolean containsValue(V value);
    public void remove(K key);
    public int size();
    public boolean isEmpty();
}
