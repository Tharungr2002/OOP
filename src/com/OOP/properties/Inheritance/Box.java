package com.OOP.properties.Inheritance;

public class Box {
    int l;
    int b;
    int w;
    Box() {
        this.l =-1;
        this.b =-1;
        this.w =-1;
    }
    Box(int l, int b,int w) {
        this.l=l;
        this.b=b;
        this.w=w;
    }
    Box(int l, int b) {
        this.l=l;
        this.b=b;
    }
    Box(Box old) {
        this.l=old.l;
        this.b=old.b;
        this.w=old.w;
    }
}
