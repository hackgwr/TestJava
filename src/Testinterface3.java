public class Testinterface3 {
    public static void main(String[] args) {
        TestA ta = new TestA();
        ta.moren1();
        ta.moren2();

        A2.staticMethod();

        TestC tac = new TestC();
        tac.staticMethod();
    }
}

interface A1{
    default void moren1(){
        System.out.println("A1.moren1");
    }

    default void moren2() {
        System.out.println("A1.moren2");
    }
}

interface A2{
    static void staticMethod(){
        System.out.println("A2.staticMethod");
    }

}

interface A3 {
    static void staticMethod() {
        System.out.println("A2.staticMethod");
    }
}


class TestA implements A1{
    @Override
    public void moren1() {
//        A1.super.moren1();
        System.out.println("A1.moren1.Override");
    }
}

class TestB implements A2{
}

class TestC implements A2,A3{
    public void staticMethod(){
        System.out.println("TestC.staticMethod");

    }
}
