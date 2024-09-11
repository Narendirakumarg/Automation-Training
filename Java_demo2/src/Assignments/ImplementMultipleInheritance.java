package Assignments;

// ImplementMultipleInheritance

	// Define the first interface
	interface InterfaceA {
	    void methodA();
	    
	}

	// Define the second interface
	interface InterfaceB {
	    void methodB();
	}

	// Implementing both interfaces in a single class
	class ImplementMultipleInheritance implements InterfaceA, InterfaceB {

	    // Providing implementation for methodA from InterfaceA
	    //@Override
	    public void methodA() {
	        System.out.println("Method A from InterfaceA");
	    }

	    // Providing implementation for methodB from InterfaceB
	    //@Override
	    public void methodB() {
	        System.out.println("Method B from InterfaceB");
	    }

	    // Additional method in the class
	    public void methodC() {
	        System.out.println("Method C from MultipleInheritance");
	    }

	    public static void main(String[] args) {
	    	ImplementMultipleInheritance example = new ImplementMultipleInheritance();
	        
	        // Calling methods from both interfaces
	        example.methodA();
	        example.methodB();
	        example.methodC();
	    }
	}

