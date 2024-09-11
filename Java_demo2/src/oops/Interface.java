package oops;



	import java.io.*;

	// A simple interface
	interface In1 {
	  
	    // public, static and final
	    final int a = 10;

	    // public and abstract
	    void display();
	}

	// A class that implements the interface.
	class Interface implements In1 {
	  
	    // Implementing the capabilities of
	    // interface.
	    public void display(){ 
	      System.out.println("Geek"); 
	    }

	    // Driver Code
	    public static void main(String[] args)
	    {
	    	Interface t = new Interface();
	        t.display();
	        System.out.println(t.a);
	    }
	}