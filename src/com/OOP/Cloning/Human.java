package com.OOP.Cloning;

public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1,2,3};
    }

    //shallow copy...only copy primitive, for non primitive just pointed to same instance
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

    // deep copy... copy and some modify to achieve complete copy
    public Object clone() throws CloneNotSupportedException{
        Human twin =  (Human)(super.clone());

        int l = twin.arr.length;
        twin.arr = new int[l];

        for(int i=0; i<l; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}


