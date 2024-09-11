package Collection;

import java.util.*;

import javax.print.attribute.Size2DSyntax;


/*COllection:
It is a collection of data/object/elements
It is dynamic nature values.

4 operations are can be performed
1. Add/store Object
2. Read/Retrieve Object 
3. Modify Object
4. Delete Object*/

public class Arraylista {

	public static void main(String[] args) 
	{
		System.out.println("==========Add===========");
		// ArrayList<Integer> a1 = new ArrayList(); // It will allow as per mentioned data type
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20.15f);
		a1.add("Hellow");
		a1.add('a');
		a1.add(true);
		
		System.out.println(a1);
		
		System.out.println("=========Retrieve============");
		
		String s1 = (String) a1.get(2);
		System.out.println(s1);
		
		System.out.println("=========Size============");
		
		int size = a1.size();
		System.out.println(size);
		
		System.out.println("=====================");
		
		// for(int i=0; i<5; i++) // softcode 5
		for(int i=0; i<size; i++) // Hardcoded 
		{
			System.out.println(a1.get(i));
		}
		System.out.println("==============All Values=======");
		
		for(Object a :a1)
		{
			System.out.println(a);
		}
		System.out.println("==============Modify=======");
		
		a1.add(1,60);
		for(Object a :a1)
		{
			System.out.println(a);
		}
		
		System.out.println("==============Remove/Delete=======");
		
		a1.remove("Hellow");
		for(Object a :a1)
		{
			System.out.println(a);
		}
	}

}
