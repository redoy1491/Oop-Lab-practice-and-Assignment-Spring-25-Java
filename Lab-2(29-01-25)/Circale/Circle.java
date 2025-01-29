//package org.redoy;

public class Circle {
    float radius;

    void Area(float r){
        radius = r;
        System.out.println("Area  : "+(Math.PI*radius*radius));
    }
    void Circumstance(float r){
        radius = r;
        System.out.println("Circumstance  : "+(Math.PI*radius*2));
    }
    void Display(){
        System.out.println("Radius : "+radius);
    }
}
