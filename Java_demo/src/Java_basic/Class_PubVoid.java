package Java_basic;

public class Class_PubVoid {

	public static void main(String[] args) {
		
		System.out.println("dsfdsggfgfg");

		Class_PubVoid add=new Class_PubVoid();
		add.sum(100, 200);
		System.out.println(add.minus(100, 50));
//		add.mul(10, 10, 10);
//		System.out.print(add.mul(10, 10, 10));
		
//		Class_PubVoid.mul(3, 3, 3);
//		mul(4, 4, 4);
		
	}
	
	public void sum(int a, int b) {
		int sum=a+b;
		//System.out.println(sum);
	}
	
	public int minus(int a, int b) 
		{
		return (a-b);
	}
	public void mul(int a, int b, int c) 
	
	{
		int mul=a*b*c;
		//System.out.println(a*b*c);
	}
	
}
