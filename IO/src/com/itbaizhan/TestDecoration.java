package com.itbaizhan;
//测试装饰器模式
public class TestDecoration {
    public static void main(String[] args) {
        Iphone phone = new Iphone("Iphone80");
        phone.show();
        System.out.println("--------进行装饰后--------");
        TouyingIphone typhone = new TouyingIphone(phone);
        typhone.show();
    }

}

class Iphone{
    private String  name;

    public Iphone(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("我是"+name+"，可以在自己屏幕上显示内容");
    }
}

class TouyingIphone{
    Iphone phone;

    public TouyingIphone(Iphone phone) {
        this.phone = phone;
    }

    public void show(){
        System.out.println("开启投影套件");
        phone.show();
        System.out.println("还可以进行投影");
        System.out.println("投影结束");
    }
}
