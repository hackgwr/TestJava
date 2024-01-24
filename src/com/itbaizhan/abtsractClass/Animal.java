package com.itbaizhan.abtsractClass;

public abstract class Animal {

    //abstract
    public abstract void shout();

    public void sleep(){
        System.out.println("animal sleep");

    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.shout();

        Cat cat1 = new Cat();
        cat1.shout();
    }

}

class Dog extends Animal{
    @Override
    public void shout() {
//        super.shout();
        System.out.println("wangwangwang");
    }

    public void watchDog(){
        System.out.println("Watchdog");
    }
}

class Cat extends Animal{
    @Override
    public void shout() {
//        super.shout();
        System.out.println("miaomiaomiao");
    }
}
