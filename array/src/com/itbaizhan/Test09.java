package com.itbaizhan;

import java.util.Arrays;

//使用二分法查找数据
public class Test09 {
    public static void main(String[] args) {
        int[] arr = {30,20,50,10,80,9,7,12,100,40,8};
        int searchWord = 20;
        //二分法查找必须先进行排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        System.out.println(searchWord+"索引位置"+binarySearch(arr,searchWord));

        int a = binarySearch(arr,searchWord);
        if (a == -1){
            System.out.println("未找到该数字");
        }else {
            System.out.println("已找到该数字");
            System.out.println(searchWord+"的索引位置为"+binarySearch(arr,searchWord));
        }
    }
    //二分法查找，array：查找数组 ，value；查找值
    public static int binarySearch(int[] array,int value){
        //二分法查找必须先进行排序
        Arrays.sort(array);
        int low = 0;
        int high = array.length-1;

        while (low<=high){
            int middle = (low+high)/2;
            if (value == array[middle]){
                return middle;
            }
            if (value>array[middle]){
                low = middle+1;
            }
            if (value<array[middle]){
                high = middle-1;
            }
        }return -1;//未找到返回-1

    }
}
