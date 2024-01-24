package com.itbaizhan.encapsulation.a;

public class TestA {
    public static void main(String[] args) {
        Car a = new Car();
//        a.check();
        a.autoLight();
        a.run();
        a.addOil();

        User u1 = new User();
        u1.setId(100);
        System.out.println(u1.getId());

    }
}
