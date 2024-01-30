package com.itbaizhan;

import java.util.Scanner;

//测试通过百度/google搜索解决问题
public class Test04 {
    public static void main(String[] args) {
        String str = null;
        if (str!=null){
            System.out.println(str.substring(0));
        }
        Scanner scnner = new Scanner(System.in);
        //System.in获取键盘上输入的数值
        System.out.println("请输入您的年龄：");
        int age = scnner.nextInt();//获取输入的数字
        System.out.println("请输入您的姓名：");
        String name = scnner.nextLine();//获取输入的文字
        //这里使用nextLine()会跳过上面nextInt()键入的回车，使用next()则不会出现这种问题。
        //发生跳过的原因是因为我们键入的内容中有一个\n，而nextInt()只接受整形，\n被添加进了nextLine()里面导致跳过的发生。
        //nextLine()的前面不能直接跟nextInt()，可以将nextLine()改为next()或者在两者之间加入一个nextLine()以解决问题。

        System.out.println("==============================");
        //打印分隔符
        System.out.println("您的名字是；"+name+"\t您的年龄是："+age);
    }
}
