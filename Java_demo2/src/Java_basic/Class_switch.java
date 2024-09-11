package Java_basic;

import java.util.Scanner;

public class Class_switch {

	public static void main(String[] args) 
	{

		//		int a =10;
		//		int b= 20;
		//		if(a>b)
		//		{					
		//			Sys15tem.out.println("Print A");
		//		}
		//		System.out.println("Print B");

		Scanner input = new Scanner(System.in);
		System.out.println("Print the age:");
		int age = input.nextInt();

		switch (age) 
		{
		case 18: System.out.println("Eligible");
		break;
		case 15:System.out.println("Ready for Eligible");
		break;
		case 10: System.out.println("Not Eligible");
		break;
		default: System.out.println("No option presen");
		break;


		}	
	}
}
