package Assignments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String value : ");
		String input = sc.nextLine();

		// String input = "Welcome to the Jungle";

		String results = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			results = results + input.charAt(i);
		}

		System.out.println("Reversed String without using reverse() method: \n" + results);

	}

}


//Explanation
//Without Using reverse() Method:
//
//1. Convert the string to a character array.
//2. Use a while loop to swap characters from the beginning and end of the array, moving towards the center.
//3. Return the new string created from the modified character array.
