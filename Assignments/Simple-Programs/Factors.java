package com.aqsa;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("Factors of "+ n +" are: ");
        while (i <= n) {
            if ((n%i) == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
