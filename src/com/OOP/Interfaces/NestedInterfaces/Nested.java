package com.OOP.Interfaces.NestedInterfaces;

public class Nested {
    interface A {
        public void fun();
    }
}

class B implements Nested.A {

    @Override
    public void fun() {
        System.out.println("fun method in nested");
    }
}
