package Assignments;

public class NNullPointerException {

	String str = null; 
	// This will cause a NullPointerException

	try
	{
		// Attempt to call a method on the null reference
		System.out.println("Length of the string: " + str.length());
	}catch(NullPointerException e)
	{
		// Handle the NullPointerException
		System.out.println("Caught a NullPointerException!");
		System.out.println("Error message: " + e.getMessage());
	}finally
	{
		System.out.println("This block is always executed.");
	}

	// Continue with the rest of the program
	System.out.println("Program continues...");

}

}
