package com.itbaizhan;
//利用Arrays.soft进行排序
import java.util.Arrays;

public class Test0801 {
    public static void main(String[] args) {
        int[] values = {1,2,4,3,5,7,6,9,0,8};
        System.out.println("排序前"+Arrays.toString(values));
        Arrays.sort(values);
        System.out.println("排序后"+Arrays.toString(values));
    }
}