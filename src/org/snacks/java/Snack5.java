//- trovare il valore minimo
//- trovare il valore massimo
//- calcolare la media
//- calcolare la sommatoria

package org.snacks.java;

public class Snack5 {

	public static void main(String[] args) {

		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };

		int max = arr[0];
		int min = arr[0];
		int arrLength = arr.length;
		int arrSum = 0;

		for (int x = 0; x < arr.length; x++) {

			arrSum += arr[x];

			if (arr[x] > max) {
				max = arr[x];

			} else if (arr[x] < min) {
				min = arr[x];
			}
		}

		float average = arrSum / arrLength;

		System.out.println("Max number in array is: " + max);
		System.out.println("Min number in array is: " + min);
		System.out.println("Array sum is: " + arrSum);
		System.out.printf("Average of array is: %.2f", average);
	}

}
