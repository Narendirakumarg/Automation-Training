package Assignments;

import java.util.Scanner;

public class ReverseStringWithMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String value : ");
		String originalString = sc.nextLine();
		StringBuilder stringBuilder = new StringBuilder(originalString);
		String reversedString = stringBuilder.reverse().toString();
		System.out.println("Reversed String using reverse() method: \n" + reversedString);

	}

}


//Scanner sc = new Scanner(System.in);
//System.out.println("Enter the Input String value : ");
//String input = sc.nextLine();


//Explanation
//Using StringBuilder's reverse() Method:
//
//1. Create a StringBuilder object with the original string.
//2. Use the reverse() method to reverse the string.
//3. Convert the StringBuilder back to a string using toString().