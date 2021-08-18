package com.aqsa;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter your choice of operator (+ - * /) ");
        String operator = input.next();
        int value = 0;

        if (operator.equals("+")) {
            value = num1 + num2;
            System.out.println(value);
        }

        if (operator.equals("-")) {
            value = num1 - num2;
            System.out.println(value);
        }

        if (operator.equals("*")) {
            value = num1 * num2;
            System.out.println(value);
        }

        if (operator.equals("/")) {
            value = num1 / num2;
            System.out.println(value);
        }

        else {
            System.out.println("Entered operator is invalid for this program.");
        }
    }
}
