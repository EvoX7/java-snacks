package org.snacks.java;

public class Snack7 {

	public static void main(String[] args) {

		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };

		String newString = words[0] + " "
				.concat(words[1])
				.concat(words[3] + " "
			    .concat(words[4] + " "
				.concat(words[5] + " "
			    .concat(words[6] + " "
				.concat(words[7])))));
		
		String newString2 = words[0] + " "
				.concat(words[1])
				.concat(words[3] + " "
			    .concat(words[4] + " "
				.concat(words[5] + " "
			    .concat(words[6] + " "
				.concat(words[7])))));
		
		System.out.println(newString);

	}
}
