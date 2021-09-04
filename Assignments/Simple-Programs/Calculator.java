package com.aqsa;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is a calculator program");
        System.out.println("Enter the operator: ");
        char op = in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.println("Enter first number: ");
            int num1 = in.nextInt();
            System.out.println("Enter second number: ");
            int num2 = in.nextInt();
            if (op == '+') {
                int sum = num1 + num2;
                System.out.println("Sum of the entered numbers is: " + sum);
            }
            if (op == '-') {
                int diff = num1 - num2;
                System.out.println("Difference between the entered numbers is: " + diff);
            }
            if (op == '*') {
                int prod = num1 * num2;
                System.out.println("Product of the entered numbers is: " + prod);
            }
            if (op == '/') {
                int div = num1 / num2;
                System.out.println("Division of the entered numbers is: " + div);
            }
        } else {
            System.out.println("Entered operator is invalid for this program");
        }
    }
}
