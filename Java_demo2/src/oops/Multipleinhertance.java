package oops;

import java.io.*;

// A simple interface
interface In3
{

	// public, static and final
	final int a = 10;

	// public and abstract
	void display();
}

interface In2
{
	final int b = 20;

	// public and abstract
	void speaker();
}

// A class that implements the interface.
class Multipleinhertance implements In3, In2
{

	// Implementing the capabilities of
	// interface.
	public void display()
	{ 
		System.out.println("Display : 1080 HD"); 
	}
	public void speaker()
	{ 
		System.out.println("Creative"); 
	}

	// Driver Code
	public static void main(String[] args)
	{
		Multipleinhertance t = new Multipleinhertance();
		t.display();
		System.out.println(t.a);

		Multipleinhertance d = new Multipleinhertance();
		d.speaker();
		System.out.println(d.b);
	}
}


