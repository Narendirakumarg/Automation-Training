package Collection;
import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20.15f);
		a1.add("Hellow");
		a1.add('a');
		a1.add(true);
		
		System.out.println(a1);
		
		System.out.println("==============Modify=============");
		
		a1.add(1,60);
		for(Object a :a1)
		{
			System.out.println(a);
		}

	}

}
