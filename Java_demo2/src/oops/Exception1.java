package oops;

public class Exception1 {

	public static void main(String[] args) throws Exception  {

		try {

			int a = 10/0;
			System.out.println(a);
		}
		catch (ArithmeticException a) 
		{
			System.out.println("Wlcom");
		}
		System.out.println("Hellow");


	}

}
