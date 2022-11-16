package org.snacks.java;

public class Snack6 {

	public static void main(String[] args) {
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };

		int[] sumArray = new int[10];

		for (int x = 0; x < 10; x++) {
			sumArray[x] = arr1[x] + arr2[x];

			System.out.println(sumArray[x] + " ");
		}

//		MIN VALUE

		int arraysMin = Integer.MAX_VALUE;
		
		for (int x = 0; x < arr1.length; x++) {
			int value = arr1[x];

			if (value < arraysMin) {
				arraysMin = value;
			}
		}
		for (int x = 0; x < arr2.length; x++) {
			int value = arr2[x];

			if (value < arraysMin) {
				arraysMin = value;
			}
		}
		System.out.println("Arrays Min is:" + arraysMin);

//		MAX VALUE

		int arraysMax = Integer.MIN_VALUE;
		
		for (int x = 0; x < arr1.length; x++) {
			int value = arr1[x];

			if (value > arraysMax) {
				arraysMax = value;
			}
		}
		for (int x = 0; x < arr2.length; x++) {
			int value = arr2[x];

			if (value > arraysMax) {
				arraysMax = value;
			}
		}
		System.out.println("Arrays Max is:" + arraysMax);

//		SUMMATION 

		int arraysSum = 0;

		for (int x = 0; x < arr1.length; x++) {

			int value = arr1[x];
			arraysSum += value;
		}
		for (int x = 0; x < arr2.length; x++) {

			int value = arr2[x];
			arraysSum += value;

		}

		int arraysAvg = arraysSum / (arr1.length + arr2.length);

		System.out.println("Total arrays sum is: " + arraysSum);
		System.out.println("Arrays average is: " + arraysAvg);
	}
}
