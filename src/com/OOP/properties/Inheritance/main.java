package com.OOP.properties.Inheritance;

public class main {
    public static void main(String[] args) {
        Boxweight obj1 = new Boxweight(1,1,1,1);

        Box obj2 = new Boxweight(1,1,1,1);

        System.out.println(obj1.weight);

        Boxcolor obj3 = new Boxcolor(2,2,2,2,2);

        Boxcolor obj4 = new Boxcolor(obj3);

        Boxcolor obj5 = new Boxcolor(2,3,40);

        Box obj6 = new Box();
            obj6.sett(10);
        System.out.println(obj6.getprivate());

        Box.greetings();


    }
}
