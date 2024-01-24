package com.itbaizhan.encapsulation.a;

public class Car {
    int id;
    String brand;

    private void Check(){
        System.out.println("Car.Check");
    }

    void addOil(){
        System.out.println("Car.addOil");

    }

    protected void autoLight(){
        System.out.println("Car.autoLight");

    }

    public void run(){
        System.out.println("Car.run");

    }

}
