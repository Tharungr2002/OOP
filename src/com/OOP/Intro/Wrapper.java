package com.OOP.Intro;

public class Wrapper {
    public static void main(String[] args) {
        int a =10;
        int b = 20;

        swap(a,b);
        System.out.println("A is" + a+ "B is" + b);

        final MainWrapper tharun = new MainWrapper("tharun");
        tharun.name = "something";

        System.out.println(tharun.name);

        MainWrapper Someone = new MainWrapper("Someone");

        System.out.println(Someone.name);
    }
    static void swap(int a,int b) {
        int temp = a;
        a=b;
        b= temp;
    }
}


class MainWrapper{
    final int a =10;
    String name;

    MainWrapper(String name){
       this.name = name;
    }


}