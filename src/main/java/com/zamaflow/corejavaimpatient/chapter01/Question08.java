package com.zamaflow.corejavaimpatient.chapter01;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				for (int j = str.length(); j > i; j--) {
					if (!Character.isWhitespace(str.charAt(j - 1))) {
						System.out.printf("%s%n", str.substring(i, j));
					}
				}
			}
		}

	}

	// f(n)
	// if n=1 return 1
	// else return n * f(n-1);

}
