package org.snacks.java;

public class Snack6 {

	public static void main(String[] args) {
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };

		int[] sumArray = new int[10];

		int maxArr1 = arr1[0];
		int minArr1 = arr1[0];
		int maxArr2 = arr2[0];
		int minArr2 = arr2[0];

		for (int x = 0; x < 10; x++) {
			sumArray[x] = arr1[x] + arr2[x];
			
			System.out.println(sumArray[x] + " ");

			if (arr1[x] > maxArr1 && arr2[x] > maxArr2) {
				maxArr1 = arr1[x];
				maxArr2 = arr2[x];

			} else if (arr1[x] < minArr1 && arr2[x] < minArr2) {
				minArr1 = arr1[x];
				minArr2 = arr2[x];
			}
		}
		System.out.println("Array1 Max is : " + maxArr1);
		System.out.println("Array2 Max is : " + maxArr2);
		System.out.println("Array1 Min is : " + minArr1);
		System.out.println("Array2 Min is : " + minArr2);

	}

}
