public class TestSuper {
    public static void main(String[] args) {
        Parent mom = new Parent();
        System.out.println(mom.number);
        mom.show();
        Parent tom = new Child();
        System.out.println(tom.number);
        tom.show();

    }

}

class Parent{
    int number = 100;

    public void show(){
        System.out.println("parent.show");

    }

}

class Child extends Parent{
    int number = 1000;

    @Override
    public void show() {
        System.out.println("child.show");
        super.show();

        System.out.println("child "+number);
        System.out.println("mom "+super.number);
    }
}
