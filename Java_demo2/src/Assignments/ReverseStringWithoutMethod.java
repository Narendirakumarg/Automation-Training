package Assignments;

public class ReverseStringWithoutMethod {

	public static void main(String[] args) {
		 String originalString = "Hello, World!";
	        String reversedString = reverseString(originalString);
	        System.out.println("Original String: " + originalString);
	        System.out.println("Reversed String without using reverse() method: " + reversedString);
	    }

	    public static String reverseString(String str) {
	        char[] charArray = str.toCharArray();
	        int left = 0;
	        int right = charArray.length - 1;
	        
	        while (left < right) {
	            // Swap the characters
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;
	            
	            // Move towards the middle
	            left++;
	            right--;
	        }
	        
	        return new String(charArray);

	}

}


//Explanation
//Without Using reverse() Method:
//
//1. Convert the string to a character array.
//2. Use a while loop to swap characters from the beginning and end of the array, moving towards the center.
//3. Return the new string created from the modified character array.