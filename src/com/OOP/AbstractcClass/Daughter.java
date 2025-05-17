package com.OOP.AbstractcClass;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("studying");
    }

    @Override
    void age() {
        System.out.println("20");
    }
}
