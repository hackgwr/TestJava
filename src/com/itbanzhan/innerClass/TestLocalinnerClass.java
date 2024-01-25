package com.itbanzhan.innerClass;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestLocalinnerClass {

    public void show(){
        System.out.println("step1");

        class inneref{
            public void testrun(){
                System.out.println("step2");
            }
        }
        new inneref().testrun();


    }

    public static void main(String[] args) {
        new TestLocalinnerClass().show();

    }
}
