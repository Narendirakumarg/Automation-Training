package Collection;

import java.util.ArrayList;

public class Array_addition {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		Integer result = 0;
		for(Integer a : arr ) {
			result = result + a;
		}
		System.out.println(result);
		//arr=30
		//a=30
		//result=60
		//op=60
		
		System.out.println("=======================");
		
		int iArr1[][] = {{10,20,10}, {40,50,60}};
		
		for(int i = 0; i < iArr1.length; i++) {
			for(int j = 0; j < iArr1[i].length; j++) {
				System.out.print(iArr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
