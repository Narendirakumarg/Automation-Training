package Java_basic;

public class Class_Arrays {

	public static void main(String[] args) {
		Class_Arrays class11=new Class_Arrays();
		class11.oneArray();
		
		int a[]= {33, 34, 9, 8, 55, 46, 75};
		System.out.println("len: "+a.length);
		class11.oneArray1(a);

	}
	
		public void oneArray()
	{
		String day[]= new String[4];
		day[0]="one";
		day[1]="two";
		day[2]="three";
		day[3]="four";
	
		System.out.println("============Method1==============");
		
		for(int i=0; i<day.length; i++)
		{
			System.out.println(day[i]);
		}
		
		System.out.println("============Method2==============");
		
		for(String a: day)
		{
			System.out.println(a);
						
		}
		
		
		System.out.println("============Method3==============");
		
		int a[]= {1,2,3,4,5,6};
			for(int n:a)
		{
			System.out.println(n);
			
		}			
	}
		
		
		
		public void oneArray1(int arr[])
		{
			System.out.println("============Array==============");
			int min=arr[0];
			
			for(int i=1; i<arr.length;i++)
			{
				if(min>arr[i])
				{
					min=arr[i];
				}
				System.out.println("min:"+min);
			}
			
		}
}
