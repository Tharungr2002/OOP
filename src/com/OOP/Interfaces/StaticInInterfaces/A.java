package com.OOP.Interfaces.StaticInInterfaces;

public interface A {
    static void Funct() {
        System.out.println("Static in A");
    }
    default void fun() {
        System.out.println("only in jav 8+");
    }
}
