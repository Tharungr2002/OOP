package com.OOP.Interfaces;

public class CPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Start like cdplayer");
    }

    @Override
    public void stop() {
        System.out.println("stop like a cdplayer");
    }

}
