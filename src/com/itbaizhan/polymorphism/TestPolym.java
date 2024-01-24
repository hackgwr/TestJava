package com.itbaizhan.polymorphism;

public class TestPolym {
    public static void main(String[] args) {
        Dog d2 = new Dog();
        animalCry(d2);

        Cat c2 = new Cat();
        animalCry(c2);

        Animal d3 = new Dog();
        d3.shout();

        Dog d4 = new Dog();
        d4.watchDog();

        Dog d5 = (Dog)d3;
        d5.watchDog();

        Cat d6 = (Cat)c2;
        d6.shout();





    }
    static void animalCry(Animal a){
        System.out.println("step1");
        a.shout();
        System.out.println("step2");

    }

}
