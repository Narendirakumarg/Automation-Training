package Java_basic;

import java.util.Scanner;

public class Class_Traffic_Signal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Green - Proceed
		// Orange = Ready for proceed
		// Red - Stop

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Print the Signal Code:");
		String signal = input.nextLine();

		switch (signal) 
		{
		case "Green": System.out.println("Go");
		break;
		case "Amber": System.out.println("Ready for GO");
		break;
		case "Red": System.out.println("Stop");
		break;
		default: System.out.println("No need to wait, go all");
		break;
		}
	}
}