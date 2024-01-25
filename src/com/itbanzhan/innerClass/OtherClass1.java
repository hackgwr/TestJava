package com.itbanzhan.innerClass;

import com.itbaizhan.encapsulation.a.TestA;

public class OtherClass1 {
    private int age = 18;
    public void show(){
        System.out.println("外部类，age = "+age);
    }
    //内部类

    //非静态内部类中不能有静态方法，静态的属性，也不能有静态的初始化块。
    class inner1{
        private int id = 1001;
        private int age = 28;
        //可以在内部类中定义与外部类同名的属性

        public void test1() {
            System.out.println("Test.inner1");
            System.out.println("当访问自己（内部类）的属性时:" + age + "\t" + id);
            System.out.println("当访问自己（内部类）的属性时:" + this.age + "\t" + this.id);


            System.out.println("当访问外部类的属性时:" + OtherClass1.this.age);
            //通过外部类名.this.外部类属性进行访问
            OtherClass1.this.show();
        }
            //通过外部类名.this.外部类方法进行访问

            class inner2{
                private int age = 38;
                private int id = 1002;
                public void test2(){
                    System.out.println("内部类的内部类属性访问:"+age+"\t"+id);
                    System.out.println("内部类的内部类属性访问:"+this.age+"\t"+this.id);
//                    System.out.println("当访问外部类的属性时:"+inner1.this);
//                    class Inner4{
//
//                        void callAll(){
//                            test1();
//                            test2();
                        }
                    }

                }

            }







//        class OtherClass1{
//
//        }
        //不能定义与外部同名的类

//        class inner2{
//            class inner3{
//
//            }//套娃
//
//        }
        //可以定义在内部类中继续定义内部类








