package org.snacks.java;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {

		Random generate = new Random();
		
		String[] names = { "Doe", "Williams", "Ford", "Smith", "Deep" };

		String[] lastnames = { "Marc", "Joe", "John", "Aaron", "Jack" };

		String[] completeNames = new String[5];

		System.out.println("Gatsby's guests:");

		for (int x = 0; x < names.length; x++) {

			String name = names[x];

			int lastnameInd = generate.nextInt(lastnames.length);
			String lastname = lastnames[lastnameInd];

			String completeName = name + " " + lastname;
			completeNames[x] = completeName;

			System.out.println(completeName);

		}
	}
}