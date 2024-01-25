package com.itbaizhan;
//数组的拷贝
public class Test03 {
    public static void main(String[] args) {
        String[] a = {"gong","wen","rui"};
        String[] b = new String[4];
        System.arraycopy(a,0,b,0,a.length);
        //System.arraycopy包含元素：Object src,int srcPos,Object dest,int destPos,int length
        //Object src : 原数组
        //int srcPos : 从元数据的起始位置开始
        //Object dest : 目标数组
        //int destPos : 目标数组的开始起始位置
        //int length : 要copy的数组的长度
        for (String temp:b){
            System.out.println(temp);
        }

    }

}
