package com.itbaizhan;
//测试调试功能
public class Test05 {
    private int num = 10;

    public void run(int a){
        System.out.println("Test05.run");
        for (int i=0;i<a;i++){
            num += a;
            go();
            System.out.println("i="+i);
        }
    }

    private void go(){
        System.out.println("Test05.go");
        System.out.println("num*10="+(num*10));
    }

    public static void main(String[] args) {
        Test05 test05 = new Test05();
        test05.run(3);
    }
}
