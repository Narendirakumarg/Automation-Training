package Collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.tree.TreePath;

public class Classcastedexception {

	public static void main(String[] args) {
		
		TreeSet as = new TreeSet();
		as.add("poi");
		as.add("dai");
		
		System.out.println("==========Add===========");
		TreeSet a1 = new TreeSet();
		a1.add("a");
		a1.add("bcd");
		a1.add("ac");
		a1.add("ab");
		a1.add("ac");
		a1.addAll(as);
		
		for(Object a : a1)
		System.out.println(a);
		
		System.out.println("============Contain===========");
		
		System.out.println(a1.contains("bcd"));
		
		System.out.println("============HasMap===========");
		
		HashMap<Integer, Character> hm = new HashMap<>();
		
		hm.put(1, 'a');
		hm.put(2, 'b');
		hm.put(3, 'x');
		hm.put(1, 'z');
		
		System.out.println(hm.get(1));
		
		System.out.println("============Set Method=========");
		
		Set s = hm.keySet();
		
		for(Object s1 : s) {
			System.out.println(hm.get(s1));
		}
		
		System.out.println("==========Remove Method=========");
		
		hm.remove(2);
		for(Object s1 :s)
		{
			System.out.println(hm.get(s1));
		}
		
		System.out.println("==========Treeset Method=========");
		
		TreeMap hm = new TreeMap();
		hm.put(1, 'a');
		hm.put(2, 'b');
		hm.put(3, 'x');
		hm.put(1, 'z');
		
		Set s = hm.keySet();
		
		}
	}
