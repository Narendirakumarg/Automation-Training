package oops;

class Sony{}
abstract class TV extends Sony 
{
	abstract void display();
	abstract void speaker();
}
class Bravia extends TV {
	void display() 
	{
		System.out.println("display : 1080");
	}
	void speaker() {
		System.out.println("Creative");
	}
}
class Bravia4k extends TV {
	void display() 
	{
		System.out.println("display : 2080");
	}
	void speaker() {
		System.out.println("BPL");
	}
}
class simple extends TV {
	void display() 
	{
		System.out.println("display : 3080");
	}
	void speaker() {
		System.out.println("Acer");
	}
}

public class Abstract {

	public static void main(String[] args) {

		Bravia b1 = new Bravia();
		b1.display();
		b1.speaker();
		
		Bravia4k c1 = new Bravia4k();
		c1.display();
		c1.speaker();
	}
}
