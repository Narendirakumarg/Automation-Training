package Java_basic;

import java.util.Scanner;

public class Class_EquilateralTriangle {

	public static void main(String[] args) {
        
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int k=1;k<=(n+1)-i;k++)
        System.out.print(" ");

        // printing '*' in each column.
        for(int j=1;j<=i;j++)
        {
          // We print '*' for each row.
          System.out.print("* ");
        }

        System.out.println();
        
        
        
    }
  }
}