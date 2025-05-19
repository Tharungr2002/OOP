package com.OOP.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human tharun = new Human("tharun",22);
        Human random = (Human)tharun.clone();

        System.out.println(random.age + " " + random.name);
        System.out.println(Arrays.toString(random.arr));


        System.out.println(Arrays.toString(tharun.arr));
        random.arr[0] =100;
        System.out.println(Arrays.toString(random.arr));

    }
}
