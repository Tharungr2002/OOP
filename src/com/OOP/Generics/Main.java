package com.OOP.Generics;

public class Main {
    public static void main(String[] args) {
        Students tharun = new Students("tharun",50);
        Students random = new Students("random",40);

        if(tharun.compareTo(random) < 0) {
            System.out.println("Random is aged");
        }
    }
}
