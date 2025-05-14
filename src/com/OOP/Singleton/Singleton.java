package com.OOP.Singleton;

import com.OOP.Access.A;

public class Singleton   {
    String s;

    private static Singleton singletonStatus;

    private Singleton() {
        System.out.println("Singletoin class");
    }
    public static Singleton SingletonMethod() {
        if(singletonStatus == null) {
            singletonStatus = new Singleton();
        }

        return singletonStatus;
    }




}
