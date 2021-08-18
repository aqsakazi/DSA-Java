package com.aqsa;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        if(num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
