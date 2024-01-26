package com.itbaizhan;
import java.util.Arrays;
//测试冒泡排序法
public class Test08 {
    public static void main(String[] args) {
        int temp;//增加一个交换用的临时变量temp
        boolean flag = true;//定义一个布尔变量，判断数组是否达到有序状态
        int[] values = {1,2,4,3,5,7,6,9,0,8};
        System.out.println("排序前的数组:"+Arrays.toString(values));
        for (int i = 0;i < values.length;i++){
            for (int j = 0;j < values.length-i-1;j++){
                if (values[j]>values[j+1]){
                    temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                    flag = false;
                }System.out.println("第"+i+"趟,第"+j+"次冒泡排序后"+Arrays.toString(values));
            }
            if(flag){
                System.out.println("结束循环");
                break;
            }else {
                flag = true;//重置原值
            }
        }
        System.out.println("冒泡排序后"+Arrays.toString(values));
    }
}
