public class TestInterface {
    public static void main(String[] args) {
        Angle a = new Angle();
        a.fly();
        a.helpOthers();

        Volant b = new Angle();
        b.fly();
//        b.helpOthers();

        Flybirds c = new Flybirds();
        c.fly();

    }


}

interface Volant{
    int FLY_HEIGHT = 100;
    void fly();
}

interface Honest{
    void helpOthers();
}

class Angle implements Volant,Honest{

    @Override
    public void fly() {
        System.out.println("fly");

    }

    @Override
    public void helpOthers() {
        System.out.println("helpOthers");

    }
}

class Flybirds implements Volant{


    @Override
    public void fly() {
        System.out.println("Flybirds");
    }
}
