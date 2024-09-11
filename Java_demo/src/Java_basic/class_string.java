package Java_basic;

public class class_string {

	
	public static void main(String[] args) { 
		
		 // create a string
	    String greet = "Hello! World";
	    System.out.println("String: " + greet);

	    System.out.println("===================================");
	    
	    // get the length of greet
	    int length = greet.length();
	    System.out.println("Length: " + length);

	    System.out.println("===================================");
	    
	    // create first string
	    String first = "Java ";
	    System.out.println("First String: " + first);

	    System.out.println("===================================");
	    
	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);
	    System.out.println(second.toLowerCase());

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);
	    System.out.println(joinedString.toUpperCase());
	    
	    
	    System.out.println("===================================");
	    
	 // create 3 strings
	    String first1 = "java programming";
	    String second1 = "java programming";
	    String third = "python programming";

	    // compare first and second strings
	    boolean result1 = first1.equals(second1);
	    System.out.println("Strings first and second are equal: " + result1);

	    // compare first and third strings
	    boolean result2 = first1.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);
	    
	    System.out.println("===================================");
	    
	    String v = "naren";
	    System.out.println(v.endsWith("en"));
	    System.out.println(v.startsWith("nar"));
	    System.out.println(v.startsWith("cnar"));
	    
	    System.out.println("===================================");
	    
	    String A = "Narendira ";
	    String B = "Kumar";
	    System.out.println(A.concat(B));
	    
	    System.out.println("===================================");
	    
	    System.out.println(A.charAt(5));
	    System.out.println(A.length());
	    
	    System.out.println("===================================");
	    
	    String C = "Narendira ";
	    String D = "Narendira ";
	    System.out.println(C.equals(D));
	    System.out.println(C.equalsIgnoreCase(D));
	    
	    System.out.println("===================================");
	    
	    System.out.println(C.replace("N", "kumar1232344").replace("dira", "saran"));
	    
	    System.out.println("===================================***");
	    
	    String E = "Narendira Kumar Saranya Samriddhi";
	    String[] splitByis=E.split("S");
	    System.out.println(splitByis.length);
	    
	    System.out.println(splitByis[0]);
	    System.out.println(splitByis[2]);
	
	    
	}

}
