package com.OOP.Interfaces;

public class Car implements Engine,Brake,Media {

    public void start() {
        System.out.println("Engine start");
    }

    public void stop() {
        System.out.println("music stop");
    }

    @Override
    public void acc() {
        System.out.println("Engine Acc");
    }

    @Override
    public void brake() {
        System.out.println("Engine brake");
    }
}
