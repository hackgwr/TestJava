package com.itbaizhan;
//序列化和反序列化
//测试TestObjectInputStream和TestObjectOutputStream：对象流
//数据源：对象
//必须将传输的对象进行序列化和反序列化，需要序列化的对象需要实现接口java.io.Serializable
//对象序列化的作用有以下两种，一，持久化 二，网络通信
//static属性不参与序列化，但对象中如果某些属性不需要进行序列化，不能使用static修饰，需要使用transient修饰！！！！！
import java.io.*;
import java.util.ArrayList;

public class TestInputOutputStream{
    public static void main(String[] args) {
//        writeObject();//序列化
        readObject();//反序列化
    }

    public static void writeObject(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/java/object_data.txt"))){
            ArrayList<User> list = new ArrayList<>();
            list.add(new User(1001,"gong","123456"));
            list.add(new User(1002,"wen","123123"));
            list.add(new User(1003,"rui","123321"));

            oos.writeObject(list);
            oos.flush();//清空缓存区
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readObject () {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/java/object_data.txt"))) {
            ArrayList<User> list = (ArrayList) ois.readObject();
            //引入User
            for (User u:list){
                System.out.println(u.getId()+","+u.getName()+","+u.getPwd());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


