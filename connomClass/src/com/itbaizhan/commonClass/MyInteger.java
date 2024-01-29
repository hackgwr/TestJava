package com.itbaizhan.commonClass;
//自定义一个简单的包装类
public class MyInteger {
    private int value;
    private static MyInteger[] cache = new MyInteger[256];
    public static final int LOW = -128;
    public static final int HIGH = 127;

    //静态初始化块：在类被加载的时候，初始化类的静态属性
    static {
        for (int i = MyInteger.LOW;i <= MyInteger.HIGH;i++){
            cache[i+(-LOW)] = new MyInteger(i);
        }
    }

    public static MyInteger valueof(int i){
        //如果在-128到127之间就直接调用缓存区间，否则创建新的对象
        if (i>=LOW && i<=HIGH){
            return cache[i+(-LOW)];
        }else {
            return new MyInteger(i) ;
        }
    }

    public int intvalue(){
        return value;
    }//把对象转换成对应的数

    @Override
    public String toString() {
        return value+"";
    }//把对象转换成对应的字符串

    private MyInteger(int i) {
        this.value = i;
    }//构造器，私有化，不让外部调用


    public static void main(String[] args) {
        MyInteger a = MyInteger.valueof(100);
        MyInteger b = MyInteger.valueof(100);
        System.out.println(a == b);

    }
}
