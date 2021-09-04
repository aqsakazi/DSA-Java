package com.aqsa;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----MAIN MENU-----");
        System.out.println("1. Perimeter Of Circle \n2. Perimeter Of Equilateral Triangle \n3. Perimeter Of Parallelogram");
        System.out.println("4. Perimeter of Rectangle \n5. Perimeter Of Square \n6. Perimeter Of Rhombus");
        System.out.println("----------------------------------------------");
        System.out.println("Enter the serial number of the program you want to execute");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter radius: ");
                int r = in.nextInt();
                float peri_circle = (float) (2 * 3.14 * r);
                System.out.println("Perimeter of the circle is: " + peri_circle);
            }
            case 2 -> {
                System.out.println("Enter side: ");
                int s = in.nextInt();
                float peri_triangle = (float) (3 * s);
                System.out.println("Perimeter of the triangle is: " + peri_triangle);
            }
            case 3 -> {
                System.out.println("Enter base: ");
                int bs = in.nextInt();
                System.out.println("Enter side: ");
                int sd = in.nextInt();
                float peri_parallelogram = (float) (2 * (bs * sd));
                System.out.println("Perimeter of the parallelogram is: " + peri_parallelogram);
            }
            case 4 -> {
                System.out.println("Enter length: ");
                int l = in.nextInt();
                System.out.println("Enter width: ");
                int w = in.nextInt();
                float peri_rectangle = (float) (2 * (l + w));
                System.out.println("Perimeter of the rectangle is: " + peri_rectangle);
            }
            case 5 -> {
                System.out.println("Enter side: ");
                int a = in.nextInt();
                float peri_square = (float) (4 * a);
                System.out.println("Perimeter of the square is: " + peri_square);
            }
            case 6 -> {
                System.out.println("Enter side: ");
                int rs = in.nextInt();
                float peri_rhombus = (float) (4 * rs);
                System.out.println("Perimeter of the rhombus is: " + peri_rhombus);
            }
            default -> System.out.println("Invalid choice!!!");
        }
    }
}
