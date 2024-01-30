package com.itbaizhan;
//测试自定义异常
public class Test03 {
    public static void main(String[] args) throws Exception {
        Person human1 = new Person();
        human1.setAge(80);
        System.out.println(human1.getAge());

        Person human2 = new Person();
        human2.setAge(-1);
        System.out.println(human2.getAge());
    }
}

//不合法的年龄异常
class IllegalAgeException extends Exception{
    //无参的构造器
    public IllegalAgeException(){
    }

    //有参的构造器
    public IllegalAgeException(String mession ){
        super(mession);
    }
}

class Person{
    private static String name;
    private static int age;

    //定义自定义异常
    public void setAge(int age) throws IllegalAgeException {
        if (age<0){
            throw new IllegalAgeException("年龄不能为负数");
            //三种方法；1.try-catch 2.throws 3.将16行的Exception改为RuntimeException(运行时异常)
        }
        Person.age = age;
    }

    public int getAge(){
        return age;
    }
}
