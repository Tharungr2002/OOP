package com.OOP.AbstractcClass;

abstract public class Parent {
    static int me = 100;
    int age;

    public Parent(int age) {
        this.age =age;
    }


    abstract void career();
    abstract void age();

    static void INparent() {
        System.out.println("I am  in Parent");
    }

    void normal() {
        System.out.println("I am normal");
    }
}
