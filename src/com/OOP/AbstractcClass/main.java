package com.OOP.AbstractcClass;

public class main {
    public static void main(String[] args) {

        son tharun = new son(22);
        System.out.println(tharun.age);
        // tharun.oijoivf();
        tharun.career();
        tharun.normal();

        Daughter d = new Daughter(20);
        System.out.println(d.age);
        d.career();

        Parent.INparent();
        System.out.println(Parent.me);
    }
}
