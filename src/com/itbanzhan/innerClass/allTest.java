package com.itbanzhan.innerClass;

public class allTest {
    class A {
        private int testA = 1;

        void testA() {
            System.out.println("Test=" + this.testA);
        }

        class B {
            private int testB = 2;

            void testB() {
                System.out.println("Test=" + this.testB);
            }

            class C {
                private int testC = 3;

                void testC() {
                    System.out.println("Test=" + this.testC);
                }
                class testAll {
                    void callAll() {
                        testA();
                        testB();
                        testC();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        allTest t1 = new allTest();
        allTest.A.B.C.testAll t2 = t1.new A().new B().new C().new testAll();
        t2.callAll();

        System.out.println("\n");

        allTest t3 = new allTest();
        allTest.A t4 = t1.new A();
        t4.testA();

        System.out.println("\n");

        allTest t5 = new allTest();
        allTest.A.B t6 = t1.new A().new B();
        t6.testB();

        System.out.println("\n");

        allTest t7 = new allTest();
        allTest.A.B.C t8 = t1.new A().new B().new C();
        t8.testC();
    }

}