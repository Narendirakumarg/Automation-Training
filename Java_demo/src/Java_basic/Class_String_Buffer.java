package Java_basic;

public class Class_String_Buffer {

	public static void main(String[] args) {
		System.out.println("**===================concat=================**");
		
		String a="Naren";
		a.concat("Kumar");
		System.out.println(a);
		
		System.out.println("**=================concat===================**");
		
		String b=a.concat("Kumar");
		System.out.println(b);
		
		System.out.println("**============reverse========append===============**");
		
		StringBuffer sb=new StringBuffer("Hellwo ");
		sb.append("How are you");
		System.out.println(sb);
		System.out.println(sb.reverse());

		System.out.println("**===================================**");
		
		String b1="Narendira kumar";
		String revString="";
		
		for(int i=b.length()-1;i>=0;i--)
		{
			revString=revString+b.charAt(i);
		}
		System.out.println(revString);
		
		System.out.println("**===================================**");
		
		
		
		
	}

}
