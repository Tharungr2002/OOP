
package com.OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine obj = new Car();
//        obj.start();

//        Media obj2 = new Car();
//        obj2.start();

//        DieselEngine obj1 = new DieselEngine();
//        obj1.start();


        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();



    }
}
