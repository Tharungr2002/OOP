package com.OOP.Static;

public class staticblock {
    static int a = 10;
    static int b;

    static{
        System.out.println("Static bloakc exc");
        b = a*10;
    }

    public static void main(String[] args) {
        staticblock obj = new staticblock();
        System.out.println(obj.a + " " + obj.b);
    }

}
