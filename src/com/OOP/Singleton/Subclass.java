package com.OOP.Singleton;

import com.OOP.Access.A;

public class Subclass extends A {

    public Subclass(String name, int n, int num) {
        super(name, n, num);
    }

    public static void main(String[] args) {
        Subclass obj1 = new Subclass("lll",20,30);
        String n = obj1.name;
    }
}

class subsubclass extends Subclass {

    public subsubclass(String name, int n, int num) {
        super(name,n,num);
    }

    public static void main(String[] args) {
        subsubclass obj1 = new subsubclass("jjj",10,80);
        String n = obj1.name;
    }
}
class SubClass2 extends A {

    public SubClass2(String name,int n ,int num) {
        super(name,n,num);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2("kk", 20,20);
        String n = obj.name;
    }
}

