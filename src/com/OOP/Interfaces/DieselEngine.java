package com.OOP.Interfaces;

public class DieselEngine implements Engine{

    @Override
    public void start() {
        System.out.println("start ike a deisel");
    }

    @Override
    public void stop() {
        System.out.println("Stops ike a deisel");
    }

    @Override
    public void acc() {
        System.out.println("Acc ike a deisel");
    }

    void MethodInDieselEngine() {
        System.out.println("ONly in deisel engine");
    }
}
