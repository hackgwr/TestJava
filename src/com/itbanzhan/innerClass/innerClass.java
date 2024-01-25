package com.itbanzhan.innerClass;

public class innerClass{


    class Inner1{
        void test1(){System.out.println("1层");}


        class Inner2{
            void test2(){System.out.println("2层");}


            class Inner3{
                void test3(){System.out.println("3层");}


                class Inner4{

                    void callAll(){
                        test1();
                        test2();
                        test3();
                    }
                }
            }
        }
    }


    public static void main(String[] args){

        innerClass o = new innerClass();

        innerClass.Inner1.Inner2.Inner3.Inner4 inner = o.new Inner1().new Inner2().new Inner3().new Inner4();

        inner.callAll();

    }

}
