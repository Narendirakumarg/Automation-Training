package oops;

public class Array1 {

	public static void main(String[] args) {

		//storing the values method 1
		int arr1[] = new int [10]; // Index will be as 0,1,2,3,4

		//storing the values method 2
//		int arr2[];
//		arr2 = new int[10];

		//storing the values method 3
		// int arr3[] = {10, 20, 30, 40, 50};

		//storing the values method 4
		// int arr4[] = new int[] {10, 20, 30};

		arr1[0] = 100;
		arr1[1] = 300;
		arr1[2] = 500;
		arr1[3] = 700;
		arr1[4] = 100;

		for (int i = 0; i < arr1.length; i++)
			System.out.println(arr1[i]);
		
		
		System.out.println(arr1.length);
	}

}
