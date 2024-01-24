package com.itbaizhan.inherit;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class TestExtend {
    public static void main(String[] args) {
        Worker worker = new Worker("gong",100,"enger","lol","java");
        worker.game();
        worker.work();
        System.out.println(worker.height);


    }

}

class Person{
    String name;
    int height;
    public void rest(){
        System.out.println("rest");
    }
}


class student{
    String name;
    int height;
    String major;
    public void rest(){
        System.out.println("rest");
    }
    public void study(){
        System.out.println("study");
    }
}

class teacher extends student{
    String game;
    public void game(){
        System.out.println("game");
    }

}

class Worker extends teacher{
    String work;
    public void work(){
        System.out.println("work");
    }

    public Worker(String name,int height,String major,String game,String work){
        this.name = name;
        this.height = height;
        this.major = major;
        this.game = game;
        this.work = work;
    }



}

