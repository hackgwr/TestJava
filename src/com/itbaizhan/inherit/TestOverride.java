package com.itbaizhan.inherit;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestOverride {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.run();
        horse.stop();
        horse.addOil();
    }

}

class Vehicle{
    private final void addOil(){
        System.out.println("oil");
    }
    public void run(){
        System.out.println("run.....");
    }

    public void stop(){
        System.out.println("stop.....");
    }
}

class Horse extends Vehicle{

    public final void addOil(){
        System.out.println("oil");
    }
    public void run(){
        System.out.println("fly.......");
    }


}

class Plane extends Vehicle{


}
