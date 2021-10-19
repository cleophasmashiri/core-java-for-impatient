package com.zamaflow.corejavaimpatient.chapter01;

import java.util.Random;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		System.out.printf("%s%n", randomString());

	}

	private static String randomString() {
		int left = 'A';
		int right = 'z';
		int len = 10; 
		StringBuilder b = new StringBuilder(len);
		Random random = new Random();
		for (int i = 0; i < len; i++) {
			int randInt = left + (int)(random.nextFloat() * (right-left+1));
			b.append((char)randInt);
		}
		return b.toString();
	}

	// f(n)
	// if n=1 return 1
	// else return n * f(n-1);

}
