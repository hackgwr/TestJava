package com.itbaizhan;
//测试TestObjectInputStream和TestObjectOutputStream：对象流
//数据源：对象
//必须将传输的对象进行序列化和反序列化，需要序列化的对象需要实现接口java.io.Serializable
//对象序列化的作用有以下两种，一，持久化 二，网络通信
//static属性不参与序列化，但对象中如果某些属性不需要进行序列化，不能使用static修饰，需要使用transient修饰！！！！！
public class User implements java.io.Serializable{

    private int id;
    private String name;
    transient private String pwd;

    //空的构造器
    public User(){

    }

    //带参数的构造器
    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    //get,set方法
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}



