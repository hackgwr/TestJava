package com.itbanzhan.innerClass;

public class testAnonymousinnerClass {

    public void test(A3 a){
        System.out.println("test.run");
        a.run();
    }

    public static void main(String[] args) {
        testAnonymousinnerClass a1 = new testAnonymousinnerClass();
        a1.test(new A3() {
            @Override
            public void run() {
                System.out.println("test.run.run");
            }
        });
    }
}

interface A3{
    void run();


}