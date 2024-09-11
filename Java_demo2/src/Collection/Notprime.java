package Collection;

import java.util.Scanner;

public class Notprime {

	public static void main(String[] args) {

// Prime Numbers :  2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, etc.		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();

		// int num;// 2-12
		boolean flag = true;
		if (num == 0 || num == 1) {
			System.out.println("Number is not prime");
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("Not a prime");
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Prime");
			}
		}
	}
}

//C:\Users\Rajesh\Documents\Zoom