public class TestInterface2 implements C {


    @Override
    public void testa() {
        System.out.println("A");

    }

    @Override
    public void testb() {
        System.out.println("B");

    }

    @Override
    public void testc() {
        System.out.println("C");

    }

    public static void main(String[] args) {
        C c1 = new TestInterface2();
        c1.testa();
        c1.testb();
        c1.testc();



    }
}

interface A{
    void testa();
}

interface B{
    void testb();
}

interface C extends A,B{
    void testc();
}
