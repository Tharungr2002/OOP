package com.OOP.properties.Polymorphism;

public class Numbers {

    public static int three(int a,int b,int c) {
        return a+b+c;
    }
    public static int two(int a,int b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(Numbers.three(1,1,1));
    }
}
