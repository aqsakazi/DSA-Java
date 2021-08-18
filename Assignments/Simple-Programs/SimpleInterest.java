package com.aqsa;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principle: ");
        float P = input.nextFloat();
        System.out.println("Enter time: ");
        float T = input.nextFloat();
        System.out.println("Enter rate: ");
        float R = input.nextFloat();
        float si = P * T * R;
        System.out.println("Simple Interest is: " + si);
    }
}
