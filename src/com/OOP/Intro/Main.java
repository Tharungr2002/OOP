package com.OOP.Intro;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student tharun = new Student("tharun",22,100.0);

        students[0]= tharun;
//        System.out.println(students[0]);
        System.out.println(tharun.name);

        Student.Greeting();

    }
}

class Student{
    String name;
    int age;
    Double marks;

    Student(String name,int age, Double marks) {
        this.name = name;
        this.age= age;
        this.marks= marks;
    }

//    public String toString() {
//        return "Name: " + name + ", Age: " + age + ", Marks: " + marks;
//    }
    static void Greeting() {
        System.out.println("Hi! First Function");
    }

}
