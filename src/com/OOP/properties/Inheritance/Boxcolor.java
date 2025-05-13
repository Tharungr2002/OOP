package com.OOP.properties.Inheritance;

public class Boxcolor extends Boxweight{
    int side;



    Boxcolor(int l, int b,int w, int weight,int side) {
        super(l,b,w,weight);
        this.side = side;
    }

    Boxcolor (Boxcolor other) {
        super(other);
    }

    Boxcolor(int l,int w,int side ) {
        super(l,w);
        this.side =side;
    }
    Boxcolor(int side) {
        this.side=side;
    }

}
