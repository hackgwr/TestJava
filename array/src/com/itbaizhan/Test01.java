package com.itbaizhan;

public class Test01 {
    //基本类型数组
    public static void main(String[] args) {
        int[] a = new int[5];//动态初始化
        int[] b = {10,20,30,40};//静态初始化
//        System.out.println(a[0]);
        for (int i=0; i<a.length;i++){
            a[i] = 10+10*i;
//            System.out.println(a[i]);
        }

//        for (int i=0;i<b.length;i++){
//            System.out.println(b[i]);
//        }

        for (int temp:b){//增强for循环,temp可替换为任何,通过for-each循环，自动遍历数组
            System.out.println(temp);
        }

        for(int i=0;i<b.length;i++){
            int temp = b[i];
            System.out.println(temp);
        }//for(int temp:b)循环的本质
    }
}
