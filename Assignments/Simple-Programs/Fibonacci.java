package com.aqsa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a program for printing the nth fibonacci term.");
        System.out.println("Enter the term: ");
        int n = input.nextInt();
        int a= 0;
        int b= 1;
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count ++;
        }
        System.out.println("The " + n + "th fibonacci term is: " + b);
    }
}
