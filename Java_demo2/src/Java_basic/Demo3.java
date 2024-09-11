package Java_basic;

// Inheritance - Can extend only one class

// Simple
// Multilevel
// Hierarchical - one parent two child
// Multiple - two parent and one child through classes
// 

public class Demo3 {

	int a = 20; // Global variable

	Demo3(int a)
	{
		a = 30; // Local variable - method 1 (either Local or Global)
		// this.a = 30; // If using this.a we are calling global variable
		// new Demo3(20).a = 30; // If need to call Global variable - method 2 
	}


	public static void main(String[] args) 
	{
		System.out.println(new Demo3(10).a);

	}
}
