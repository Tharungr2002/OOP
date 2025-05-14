package com.OOP.Access;

import java.util.Objects;

public class ObjectsDemo {
    int num;
    int gpa;

    public ObjectsDemo(int num, int gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectsDemo)obj).num;
    }

    @Override
    public String toString() {
        return "ObjectsDemo{" +
                "num=" + num +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, gpa);
    }

    public static void main(String[] args) {
        ObjectsDemo obj1 = new ObjectsDemo(12,3);
        ObjectsDemo obj2 = new ObjectsDemo(12,4);

        if(obj1.equals(obj2)) {
            System.out.println("both are equal");
        }
    }
}
