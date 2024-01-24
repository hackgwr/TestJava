package com.itbaizhan.inherit;

public class TestComposition {
    public static void main(String[] args) {
        Stu d1 = new Stu("gong",1999,"farm");
        d1.person.rest();
        System.out.println(d1.major);
        System.out.println(d1.person.name);
        System.out.println(d1.person.height);


        Computer dell = new Computer();
        dell.cpu.calculate();
        dell.memory.store();


    }
}

class Stu{

    Person person = new Person();
    String major;

    public void Study(){
        System.out.println("study");
    }

    public Stu(String name,int height,String major){
        this.person.name = name;
        this.person.height = height;
        this.major = major;
    }


}


class CPU{
    public void calculate(){
        System.out.println("CPU calculate");

    }

}

class Memory{
    public void store(){
        System.out.println("Memory store");

    }

}

class Computer{
    CPU cpu = new CPU();
    Memory memory = new Memory();

}
