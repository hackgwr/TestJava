package com.itbaizhan;
//引用类型数组
public class Test02 {
    public static void main(String[] args) {

        User[] user2 = {new User(1001,"gong"),
                        new User(1002,"wen"),
                        new User(1003,"rui")
        };//静态初始化

        User[] users = new User[3];
        users[0] = new User(1001,"gong");
        users[1] = new User(1002,"wen");
        users[2] = new User(1003,"rui");

//        for(int i=0;i<users.length;i++){
//            System.out.println(users[i]);
//            System.out.println(users[i].getId());
//            System.out.println(users[i].getName());
//            System.out.println(users[i].toString());
//        }
        for (User temp:user2){
            System.out.println(temp);
        }//for-each循环
    }
}

class User{
    private int id;
    private String name;

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

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
