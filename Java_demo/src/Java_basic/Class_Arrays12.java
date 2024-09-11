package Java_basic;

public class Class_Arrays12 {

	public static void main(String[] args) {
		
		String str="we need to print the elements of the arr";
		splitString(str);
	}
	
	public static void splitString(String str)
		{
		String[] ab=str.split("Naren");
		System.out.println(ab.length);
		for(String st: ab)
		{
			System.out.print(st);
		}
	}

}