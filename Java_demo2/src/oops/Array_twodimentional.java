package oops;

public class Array_twodimentional {

	public static void main(String[] args) {
		//int arr1[][] = new int [5][2];

		//storing the values method 1

		//		arr1[0][0] = 100;
		//		arr1[1][1] = 300;
		//		arr1[2][0] = 500;
		//		arr1[3][1] = 700;
		//		arr1[4][0] = 100;
		
		// Column values are same

//		int arr1[][] = {{10,20,30}, {40,50,60}, {70,80,90}};
//
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1.length; j++)
//				System.out.print(arr1[i][j] + " ");
//
//			System.out.println();
			
			System.out.println("========================");
		// Jagged Array
			int arr2[][] = {{10,20,10}, {40,50,60}, {70,80,10}};

			for (int i = 0; i < arr2.length; i++) {
				for (int j = 0; j < arr2.length; j++)
					System.out.print(arr2[i][j]+ " ");

				System.out.println();

		}
	}
}
