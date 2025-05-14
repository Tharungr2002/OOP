package com.OOP.Access;

public class A {
    protected String name;
    int n;
    private int num;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public A(String name, int n, int num) {
        this.name = name;
        this.n = n;
        this.num = num;
    }
    public A() {

    }
}
