package com.OOP.Generics;

public class Students implements Comparable<Students>{

    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public int compareTo(Students o) {
        int diff = (int)this.age - o.age;
        return diff;
    }
}
