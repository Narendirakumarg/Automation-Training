package Java_basic;
//Static variable is belong to class
// global variable is belong to object

public class Class_static_nonstatic 
{

	static int i;	

	public static void main(String[] args) 
	{
		// Created Object1
		
		Class_static_nonstatic a1 = new Class_static_nonstatic();
		
		System.out.println(a1.i); // 0

		a1.i = 20;

		System.out.println(a1.i); // 20
		
		// Created Object2
		
		Class_static_nonstatic a2 = new Class_static_nonstatic();
		
		a2.i = 50;
		
		System.out.println(a2.i);  // 50
		System.out.println(a1.i);  // 20
		
		new Class_static_nonstatic().i = 60;
		System.out.println(new Class_static_nonstatic().i); //  0
		
	}
	
	// Actual Output as 10 20 50 20 10
	
	static void run()
	{
		i=50;
	}
	void test()
	{
		i=0;
	}

}