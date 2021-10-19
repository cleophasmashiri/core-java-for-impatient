package com.zamaflow.corejavaimpatient.chapter01;

import java.math.BigInteger;
import java.util.Scanner;

public class Question06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger b = BigInteger.ONE;
        for (int i = 2; i <= 1000; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial(1000)=%d%n", b);
    }

    // f(n) 
    // if n=1 return 1
    // else return n * f(n-1);       
    
}
