package com.aqsa;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to generate the fibonacci series: ");
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.println("Fibonacci series is: ");
        System.out.println(a);
        System.out.println(b);
        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.println(b);
            count++;
        }
    }
}
