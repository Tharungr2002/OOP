package com.OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try{
            String name = "tharun";
            if(name.equals("tharun")) {
                    throw new Exception("I am tharun");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Always runnning");
        }
    }
     static int div(int a, int b)  throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("This is Exception");
        }
        return a/b;
    }
}
