//package org.redoy;

import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle r= new Circle();
        System.out.print("Enter Radius : ");
        float radius = input.nextFloat();
        r.Display();
        r.Area(radius);
        r.Circumstance(radius);

    }
}