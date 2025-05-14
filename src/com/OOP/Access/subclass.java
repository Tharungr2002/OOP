package com.OOP.Access;

public class subclass extends A{

    public subclass(String name, int n, int num) {
        super(name, n, num);
    }

    public static void main(String[] args) {
        subclass obj1 = new subclass("ttt",10,90);
        System.out.println(obj1.n);
    }
}
