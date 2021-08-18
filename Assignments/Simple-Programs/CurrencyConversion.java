package com.aqsa;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency in rupees: ");
        float rupee = input.nextFloat();
        float dollar = rupee/74;
        System.out.println("The conversion of " + rupee + " rupees is " + dollar + " dollars");
    }
}
