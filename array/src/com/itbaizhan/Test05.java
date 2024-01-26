package com.itbaizhan;

import java.util.Arrays;

//二维数组的基本语法
public class Test05 {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[2];
        a[0][0] = 10;
        a[0][1] = 20;
        a[1] = new int[]{10,20,30,40};
        a[2] = new int[]{10,20,30};

        int[][] b = new int[][]{
                {10,20,30},
                {10,20},
                {100,200,300,400}
        };

        for (int i = 0;i < b.length;i++){
            for (int m = 0;m<b[i].length;m++){
                System.out.print(b[i][m]+"\t");
            }
            System.out.println();
        }//使用一般方式遍历

        for (int i = 0;i < b.length;i++){
            System.out.println(Arrays.toString(b[i]));
        }//利用Arrays.toString方法类进行遍历
    }
}
