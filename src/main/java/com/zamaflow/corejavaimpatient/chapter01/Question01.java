package com.zamaflow.corejavaimpatient.chapter01;

import java.util.Scanner;

// 1. Write a program that reads an integer and prints it in binary, octal, and hexadecimal. 
// Print the reciprocal as a hexadecimal floating-point number.

public class Question01 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int num = scan.nextInt();
            System.out.printf("Binary: %s%n", Integer.toBinaryString(num));
            System.out.printf("Octal: %o%n", num);
            System.out.printf("Hexadecimal: %x%n", num);
            System.out.printf("Hexadecimal floating point: %a%n", 1.0 / num);
        }

    }
}
