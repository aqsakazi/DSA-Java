package com.aqsa;

import java.util.Scanner;

public class DistanceBetween2Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of first point: ");
        float x1 = sc.nextFloat();
        System.out.println("Enter the y-coordinate of first point: ");
        float y1 = sc.nextFloat();
        System.out.println("Enter the x-coordinate of second point: ");
        float x2 = sc.nextFloat();
        System.out.println("Enter the y-coordinate of second point: ");
        float y2 = sc.nextFloat();
        float d = (float) (Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))));
        System.out.println("The distance between two points is: "+ d);
    }
}
