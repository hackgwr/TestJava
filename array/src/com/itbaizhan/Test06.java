package com.itbaizhan;

import java.util.Arrays;

//测试二维数组利用Object数组存储表格信息
public class Test06 {
    public static void main(String[] args) {
        Object[] a1 = {
                1001,"gong",18,"教师","2019-02-14"
        };//包装类

        Object[] a2 = {
                1002,"wen",19,"助教","2019-10-10"
        };

        Object[] a3 = {
                1003,"rui",20,"班主任","2019-05-05"
        };

//        System.out.println(Arrays.toString(a1));

        Object[][] A1= {a1,a2,a3};
        for (int b = 0;b < A1.length;b++){
            System.out.println(Arrays.toString(A1[b]));
        }//Arrays方法进行遍历

        System.out.println();

        Object[][] A2 = {a1,a2,a3};
        for (int c1 = 0;c1 < A2.length;c1++){
            for (int c2 = 0;c2 < A2[c1].length;c2++){
                System.out.print(A2[c1][c2]);
            }
            System.out.println();
        }//普通方法进行遍历方法1

        System.out.println();

        Object[][] A3 = new Object[3][];
        A3[0] = a1;
        A3[1] = a2;
        A3[2] = a3;
        for (int c3 = 0;c3 < A3.length;c3++){
            for (int c4 = 0;c4 < A3[c3].length;c4++){
                System.out.print(A3[c3][c4]);
            }
            System.out.println();
        }//普通方法进行遍历方法2



    }
}
