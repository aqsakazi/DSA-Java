package com.aqsa;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        }
        else {
            System.out.println(number + " is an odd number");
        }
    }
}
