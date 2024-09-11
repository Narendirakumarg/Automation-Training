package Java_basic;

import java.util.Scanner;

public class class1 {

	public static void main(String[] args) 
	{

		//		int a =10;
		//		int b= 20;
		//		if(a>b)
		//		{					
		//			System.out.println("Print A");
		//		}
		//		System.out.println("Print B");

		Scanner input = new Scanner(System.in);
		System.out.println("Print the age:");
		int age = input.nextInt();
		if(age>=18)
		{
			System.out.println("eligible");
		}
		else if (age>=15 && age<18)
		{
			System.out.println("Able to apply");
		}
		else
		{
			System.out.println("Not eligible");
		}		

	}
}