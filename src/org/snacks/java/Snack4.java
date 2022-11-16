package org.snacks.java;

import java.util.Random;

public class Snack4 {

	public static void main(String[] args) {

		int[] array1 = new int[10];
		int[] array2 = new int[6];

		Random rdn = new Random();

		for (int x = 0; x < array1.length - array2.length; x++) {

			int RandomNumber = rdn.nextInt(30);
			System.out.println(RandomNumber);

		}

	}

}
