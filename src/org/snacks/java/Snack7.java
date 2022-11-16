package org.snacks.java;

public class Snack7 {

	public static void main(String[] args) {

		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };

		for (int i = 0; i < words.length; i++) {

			System.out.print(words[i] + " ");
		}
		System.out.print("\n");

		for (int i = words.length - 1; i >= 0; i--) {

			System.out.print(words[i] + " ");

		}

	}
}