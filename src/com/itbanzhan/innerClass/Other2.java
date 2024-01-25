package com.itbanzhan.innerClass;

public class Other2 {
    private int c1 = 10;
    private static  int c2 = 20;

    static class innerOther2{
        public void testInnerOther2(){
            System.out.println(c2);
//            System.out.println(c1);
        }
    }
}
