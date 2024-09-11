package oops;

public class Stringclass 
{

	public static void main(String[] args) 
	{
		String s1 = new String("Java");
		String s3 = new String("java");

		String s2 = "Java Mistake";
		String s4 = "Java is power";
		String s5 = "";
		String s6 = "  Java is power  ";
		System.out.println(s1==s3);
		
		// Length
		System.out.println(s1.length());
		s1.contains(s1);
		System.out.println(s1);
		
		// Concatenation
		System.out.println(s1.concat(s2));
		
		// Upper
		System.out.println(s2.toUpperCase());
		
		// lower
		System.out.println(s2.toLowerCase());
		
		// Equals
		System.out.println(s1.equals(s3));
		
		// Equalsignorecase
		System.out.println(s1.equalsIgnoreCase(s3));
		
		// isEmpty
		System.out.println(s5.isEmpty());
		
		// isBlank
		System.out.println(s5.isBlank());
		
		// contains
		System.out.println(s2.contains("Java"));
		
		// Index
		System.out.println(s2.indexOf("a"));
		
		// lastIndex
		System.out.println(s2.lastIndexOf("a"));
		
		// trim
		System.out.println(s6);
		System.out.println(s6.trim());
		
		//substring
		System.out.println(s6.substring(6));
		System.out.println(s6.substring(6, 9));
		
		// Divide String - split
		
		String str = "Java is power";
		String str1[] = str.split(" ");
		for(String s:str1)
		{
			System.out.println(s);
		}
		
		// CharAt
		System.out.println(s6.charAt(2));
		
		System.out.println("===============");
		// Reverse
		String input = "Geeks for Geeks";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1a
        input1.reverse();

        // print reversed String
        System.out.println(input1);
				
	}

}
