package Java_basic;

import java.util.Scanner;

public class Odd_Program {

	public static void main(String[] args) {

		/*
		 * Scanner reader = new Scanner(System.in);
		 * 
		 * System.out.print("Enter a number: "); int num = reader.nextInt();
		 * 
		 * if(num % 2 == 0) 
		 * System.out.println(num + " is even"); 
		 * else
		 * System.out.println(num + " is odd");
		 */
		
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
		
    }
}