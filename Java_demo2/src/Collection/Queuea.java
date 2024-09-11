package Collection;

/**
 * Remove() - Removes the head element from the queue. If queue is empty we will get NoSuchElementException 
 * Poll() - Removes the head element from the queue. If queue is empty we will get null queue
 * Both remove and poll methods are retrieving the first element by removing
 * Element() - Retrieves the head element from the queue. If queue is empty we will get NoSuchElementException 
 * Peek() - Retrieves the head element from the queue. If queue is empty we will get null queue
 * Both Element and Peek methods are retrieving the first element without removing
 */


import java.util.PriorityQueue;

public class Queuea {

	public static void main(String[] args) {
		PriorityQueue que = new PriorityQueue();
		
		que.add("Apple");
		que.add("Orange");
		que.add("Banana");
		
	//	System.out.println(que);
		
		for(Object a:que)
		{
			System.out.println(a);
		}
		
		System.out.println("<=============Remove===============>");
		
//		que.remove();
//		System.out.println("Removed" +que);

		System.out.println("<=============Poll=================>");
		
//		que.poll();
//		System.out.println("Poll Removed " +que);
		
		System.out.println("<=============Element==============>");
		
		Object elementVar = que.element();
		System.out.println("Removed : " +elementVar);
		System.out.println("After Removed : " +que);
		
		System.out.println("<=============Peek=================>");
		
		Object peekVar = que.peek();
		System.out.println("Removed : " +peekVar);
		System.out.println("After Removed : " +que);
	}

}
