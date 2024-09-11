package Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListinAscendingOrder {

	public static void main(String[] args) {

		// Create an ArrayList
		ArrayList<Integer> numbers = new ArrayList<>();

		// Add elements to the ArrayList
		numbers.add(5);
		numbers.add(3);
		numbers.add(8);
		numbers.add(1);
		numbers.add(6);

		// Print the ArrayList before sorting
		System.out.println("ArrayList Before Sorting: " + numbers);

		// Sort the ArrayList in ascending order
		Collections.sort(numbers);

		// Print the ArrayList after sorting
		System.out.println("ArrayList After Sorting: " + numbers);

	}

}
