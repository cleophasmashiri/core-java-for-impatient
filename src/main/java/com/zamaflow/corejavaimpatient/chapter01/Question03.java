package com.zamaflow.corejavaimpatient.chapter01;

import java.util.Scanner;

public class Question03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int one = s.nextInt();
		int two = s.nextInt();
		int three = s.nextInt();
      	int largest = one >= two? (one >= three? one: three): two;
        System.out.printf("The largest using tenary: %d%nUsing Math.max: %d", largest, Math.max(Math.max(one, two), three));
    }
    
}
