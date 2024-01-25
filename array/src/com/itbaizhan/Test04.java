package com.itbaizhan;
//测试工具类java.util.Arrays
import java.lang.reflect.Array;
import java.util.Arrays;
public class Test04 {
    public static void main(String[] args) {
        int[] a = {10,32,25,43,41,53};
        System.arraycopy(a,0,Test.c,0,6);
        int[] b = new int[6];
//        System.out.println(a);
        System.out.println(Arrays.toString(a));//java.util.Arrays工具类
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.arraycopy(a,0,b,0,6);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(Test.c));

        System.out.println(Arrays.binarySearch(a,25));//二分查找

        int[] d = new int[10];
        Arrays.fill(d,100);//fill方法进行填充
        System.out.println(Arrays.toString(d));
    }
    public static class Test{
        public static final int[] c = new int[6];
    }//静态常量数组的定义
}
