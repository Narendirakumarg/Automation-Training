package Assignments;

public class ArrayIndexOutOfBound 
{

	public static void main(String[] args) 
	{
		// Create an array with 5 elements
        int[] array = {1, 2, 3, 4, 5};

        try 
        {
            // Attempt to access an index that is out of bounds
            int outOfBoundsElement = array[7];
            System.out.println("This line will not be executed.");
        } catch (ArrayIndexOutOfBoundsException e) 
        {
            // Handle the exception
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Error: " + e.getMessage());
        }

        // The program continues after handling the exception
        System.out.println("Program continues after handling the exception.");

	}

}
