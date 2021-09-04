package com.aqsa;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----MAIN MENU-----");
        System.out.println("1. Area Of Circle \n2. Area Of Triangle \n3. Area Of Rectangle");
        System.out.println("4. Area Of Parallelogram \n5. Area Of Rhombus");
        System.out.println("-------------------------------------------");
        System.out.println("Enter the serial number of the program you want to execute");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter radius: ");
                int r = in.nextInt();
                float area_circle = (float) (3.14 * r * r);
                System.out.println("Area of the circle is: " + area_circle);
            }
            case 2 -> {
                System.out.println("Enter base: ");
                int b = in.nextInt();
                System.out.println("Enter height: ");
                int h = in.nextInt();
                float area_triangle = (float) (0.5 * b * h);
                System.out.println("Area of triangle is: " + area_triangle);
            }
            case 3 -> {
                System.out.println("Enter length: ");
                int l = in.nextInt();
                System.out.println("Enter breath: ");
                int br = in.nextInt();
                float area_rectangle = (float) (l * br);
                System.out.println("Area of rectangle is: " + area_rectangle);
            }
            case 4 -> {
                System.out.println("Enter base: ");
                int bs = in.nextInt();
                System.out.println("Enter height: ");
                int ht = in.nextInt();
                float area_parallelogram = (float) (bs * ht);
                System.out.println("Area of parallelogram is: " + area_parallelogram);
            }
            case 5 -> {
                System.out.println("Enter first diagonal length: ");
                int d1 = in.nextInt();
                System.out.println("Enter second diagonal length: ");
                int d2 = in.nextInt();
                float area_rhombus = (float) (d1 * d2);
                System.out.println("Area of rhombus is: " + area_rhombus);
            }
            default -> System.out.println("Invalid menu choice!!!");
        }
    }
}
