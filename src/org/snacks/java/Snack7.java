package org.snacks.java;

public class Snack7 {

	public static void main(String[] args) {

		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };

		String shortestW = words[0];
		String longestW = words[0];

//		Normal string
		for (int i = 0; i < words.length; i++) {

			System.out.print(words[i] + " ");
		}

		System.out.print("\n");

//		Reverse string

		for (int i = words.length - 1; i >= 0; i--) {

			System.out.print(words[i] + " ");

		}

//		Longest and shortest word and her length

		for (int w = 0; w < words.length; w++) {

			if (shortestW.length() > words[w].length())
				shortestW = words[w];

			else if (longestW.length() < words[w].length())
				longestW = words[w];

		}

		System.out.print("\n");

		System.out.println("Shortest word is: " + shortestW + " " + "length: " + shortestW.length());
		System.out.println("Longest word is: " + longestW + " " + "length: " + longestW.length());
	}
}