package com.OOP.Interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start like elctric");
    }

    @Override
    public void stop() {
        System.out.println("Stop like electric");
    }

    @Override
    public void acc() {
        System.out.println("Acc likes a electric");
    }
}
