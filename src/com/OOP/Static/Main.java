package com.OOP.Static;



public class Main {
    public static void main(String[] args) {
        car Beem = new car("black",200,"beem");
        System.out.println(car.Counter);
        car Audi = new car("blue",200,"Audi");
        System.out.println(car.Counter);

        car.PrintCount();
        System.out.println(car.Counter);

        fun();




    }
     static void fun() {
         Main obj = new Main();
         obj.greetings();
    }

     void greetings() {
        System.out.println("hi!!!");
    }
}

class car{
    String Color;
     int Price = 2000;
    String Model;
    static int Counter;

    public car(String color, int price, String model) {
        this.Color = color;
        this.Price = price;
        this.Model = model;
        car.Counter++;
    }

     static void PrintCount() {
        car.Counter++;
    }
}
