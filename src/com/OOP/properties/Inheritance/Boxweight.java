package com.OOP.properties.Inheritance;

public class Boxweight extends Box {
    int weight;

    Boxweight(int l,int b,int w,int weight) {
        super(l,b,w);
        this.weight= weight;
    }

    Boxweight(Boxweight old) {
        super(old);
    }

    Boxweight(int l, int w) {
        super(l,w);
        this.l=l;
        this.w=w;
    }

    Boxweight() {
        super();
        this.weight=-6;
    }


}
