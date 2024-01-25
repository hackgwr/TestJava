package com.itbanzhan.innerClass;

public class TestinnerClass1 {
    public static void main(String[] args) {

//        innerClass test0 = new innerClass();
        OtherClass1.inner1 innertest = new OtherClass1().new inner1();
        innertest.test1();

        OtherClass1.inner1.inner2 innertest2 = new OtherClass1().new inner1().new inner2();
        innertest2.test2();

    }
}
