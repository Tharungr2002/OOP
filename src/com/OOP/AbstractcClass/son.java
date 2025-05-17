package com.OOP.AbstractcClass;

public class son extends Parent{

    public son(int age) {
        super(age);
    }

    @Override
    void normal() {
        System.out.println("normal override in son");
    }

    @Override
    void career() {
        System.out.println("engineer");
    }

    @Override
    void age() {
        System.out.println("22");
    }

//    void oijoivf() {
//        Parent.INparent();
//    }

}
