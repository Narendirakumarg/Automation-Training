package oops;

/*
 * Data Type Casting: Converting one type to another type is called type casting
 * 
 * Primitive casting converting one primitive to another
 * 
 * > Auto-widening Converting a smaller primitve data type to any of the bigger
 * data type, It is done by the compiler automatically
 * 
 * byte short int long float double
 * 
 * > Explicite narrowing Converting a bigger primitve data type to any of the
 * smaller data type, using cast operator
 * 
 * Derived casting Converting an oject to behave like another possible type. To
 * do that there shoud be a relationshp.
 * 
 * Upcasting
 * 
 * Converting an object of sub class to behave like any of the super type.It is
 * done by the compiler automatically
 * 
 * Downcasting
 * 
 * Direct downcasting is not possible - CTE Explicit downcasting using cast
 * operator is also not possible - Run time exception [ClassCastException]
 * 
 * Converting an upcasted object(super class type) to behave like any of the sub
 * type
 * 
 * Note: upcasted/downcasted objects always
 */


class Apple {
	void eat() {
		System.out.println("Eat Apple");
	}
}

class GreenApple extends Apple {
	void test() 
	{
		System.out.println("Eat Greenapple");
	}
}

public class Upcasting {

	public static void main(String[] args) {

		/*
		 * Apple app = new Apple(); app.eat();
		 * 
		 * Apple a1 = new GreenApple();//Upasting a1.eat(); a1.test();
		 * 
		 * GreenApple green = new GreenApple(); green.eat(); green.test();
		 * 
		 * Apple a1 = green;//Upcasting
		 */
		// Down casting
		// GreenApple a1 = (GreenApple) new Apple();//Run Time Exception

		/*
		 * Apple a1 = new GreenApple();//upcasted GreenApple green = (GreenApple)
		 * a1;//downcasting green.eat(); green.test();
		 */

		// Apple app = new Apple();
		// app.eat();

		// Apple a1 = new GreenApple();
		// a1.eat();


		GreenApple green = new GreenApple(); 
		green.eat();

	}

}
