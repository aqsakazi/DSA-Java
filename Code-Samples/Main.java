package com.aqsa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
    }

    public static class Inputs {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int rollno = input.nextInt();
            System.out.println("Your roll no is " + rollno);
        }
    }
}
