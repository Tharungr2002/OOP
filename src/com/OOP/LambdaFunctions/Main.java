package com.OOP.LambdaFunctions;

public class Main {
    public static void main(String[] args) {
//        Operation add = new Operation() {
//            public int operate(int a,int b) {
//                return a+b;
//            }
//        };
        Operation add = (a,b) -> a+b;
        System.out.println(add.operate(1,1));
    }
}


interface Operation {
    int operate(int a, int b);
}