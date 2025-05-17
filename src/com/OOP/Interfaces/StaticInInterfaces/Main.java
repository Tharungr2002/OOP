package com.OOP.Interfaces.StaticInInterfaces;

public class Main implements A,B{

    @Override
    public void greet() {
        System.out.println("HIIIIIIIII");
    }

    public static void main(String[] args) {
        Main obj = new Main();

        A.Funct();
        obj.fun();
    }
}
