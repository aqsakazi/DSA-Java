package com.aqsa;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int num = n;
        System.out.println("Enter the digit whose occurrence you want to count: ");
        int digit = input.nextInt();
        int count = 0;
        while (n > 0) {
            int x = n % 10;
            if (x == digit) {
                count ++;
            }
            n /= 10;
        }
        System.out.println("The occurrence of " + digit + " in " + num + " is " + count + " times");
    }
}
