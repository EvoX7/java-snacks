
package org.snacks.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {

		// Snack 1

		Scanner sc = new Scanner(System.in);

		System.out.println("Even / Odd");
		System.out.print("Please, enter a number: ");
		int num = sc.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

		sc.close();
	}
}
