//Snack3
//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

package org.snacks.java;

public class Snack3 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int oddSum = 0;

		for (int x = 0; x < numbers.length; x++) {

			if (x % 2 != 0) {
				int sum = numbers[x];
				oddSum += sum;

			}

		}
		System.out.println("Numbers sum in odd position is: " + oddSum);
	}
}
