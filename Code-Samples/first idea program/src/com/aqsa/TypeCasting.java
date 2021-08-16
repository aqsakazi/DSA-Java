package com.aqsa;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num);

        //type casting
        int num1 = (int)(483.37f);
        System.out.println(num1);

        //automatic type promotion in expression
        int m = 257;
        byte n = (byte)(m);
        System.out.println(n);

        byte g = 20;
        byte h = 19;
        byte e = 43;
        int j = (g*h)/e;

        System.out.println(j);

        int number = 'A';
        System.out.println(number);

        //java follows unicode
        System.out.println("こんにちは"); //this will be printed as it is

        //TYPE PROMOTION RULES
//        1. all the byte, char, short values are promoted to integer.
//        2. if one of the operand is long / float / double then whole operation will  be promoted to long / float/ double.


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 6.32f;
        double d = 0.12337424;
        double result = (f * b) + (i / c) - (d * s);
        //float + int - double = double ...... because of multiple datatypes, all others are converted into biggest one and as double here is in dominance, output will be in double

        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);

    }
}
