package com.aqsa;

import java.util.Scanner;

public class VolumeAndSurfaceArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----MAIN MENU-----");
        System.out.println("1. Volume Of Cone \n2. Volume Of Prism \n3. Volume Of Cylinder \n4. Volume Of Sphere");
        System.out.println("5. Volume Of Pyramid \n6. Curved Surface Area Of Cylinder \n7. Total Surface Area Of Cube");
        System.out.println("---------------------------------------------");
        System.out.println("Enter the serial number of the program you want to execute");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter radius: ");
                int r = in.nextInt();
                System.out.println("Enter height: ");
                int h = in.nextInt();
                float volume_cone = (float) (3.14 * r * r * (h / 3));
                System.out.println("Volume of cone is: " + volume_cone);
            }
            case 2 -> {
                System.out.println("Enter base: ");
                int bs = in.nextInt();
                System.out.println("Enter height: ");
                int ht = in.nextInt();
                float volume_prism = (float) (bs * ht);
                System.out.println("Volume of prism is: " + volume_prism);
            }
            case 3 -> {
                System.out.println("Enter radius: ");
                int rd = in.nextInt();
                System.out.println("Enter height: ");
                int he = in.nextInt();
                float volume_cylinder = (float) (3.14 * rd * rd * he);
                System.out.println("Volume of cylinder is: " + volume_cylinder);
            }
            case 4 -> {
                System.out.println("Enter radius: ");
                int ra = in.nextInt();
                float volume_sphere = (float) ((4 / 3) * 3.14 * ra * ra * ra);
                System.out.println("Volume of sphere is: " + volume_sphere);
            }
            case 5 -> {
                System.out.println("Enter base length: ");
                int bl = in.nextInt();
                System.out.println("Enter base width: ");
                int bw = in.nextInt();
                System.out.println("Enter pyramid height: ");
                int ph = in.nextInt();
                float volume_pyramid = (float) ((bl * bw * ph) / 3);
                System.out.println("Volume of pyramid is: " + volume_pyramid);
            }
            case 6 -> {
                System.out.println("Enter base radius: ");
                int br = in.nextInt();
                System.out.println("Enter height of the cylinder: ");
                int ch = in.nextInt();
                float csa_cylinder = (float) (2 * 3.14 * br * ch);
                System.out.println("Curved surface area of cylinder is: " + csa_cylinder);
            }
            case 7 -> {
                System.out.println("Enter edge length: ");
                int el = in.nextInt();
                float tsa_cube = (float) (6 * el * el);
                System.out.println("Total surface area of a cube is: " + tsa_cube);
            }
            default -> System.out.println("INVALID CHOICE!!!!");
        }
    }
}
