package com.aqsa;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Entered character is lowercase");
        }
        else {
            System.out.println("Entered character is uppercase");
        }
    }
}
