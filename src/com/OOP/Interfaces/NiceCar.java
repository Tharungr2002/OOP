package com.OOP.Interfaces;

public class NiceCar {
    private Engine engine;
    private CPlayer mediaplayer = new CPlayer();

    public NiceCar() {
        engine = new DieselEngine();
    }
    public void start() {
        engine.start();
    }
    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        mediaplayer.start();
    }
    public void stopmusic() {
        mediaplayer.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }


}





