package com.aqsa;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number which you want to reverse: ");
        int num = in.nextInt();
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            num/=10;
            rev = rev * 10 + rem;
        }
        System.out.println("The reverse of "+num+" is: "+rev);
    }
}
