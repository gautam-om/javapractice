package package2;

import java.util.LinkedList;

 /*             */

public class ExmLinkedList {

	public static void main(String[] args)
	{
		LinkedList<String> linked = new LinkedList<String>();
		linked.add("A");
		linked.add("B");
		linked.addLast("G");
		linked.addFirst("D");
		linked.add(3, "E");
		
		System.out.println(linked);
		
		linked.remove("A");
		linked.remove(3);
		linked.removeFirst();
		linked.removeLast();
		
		System.out.println(linked);
		
		linked.add("Om");
		linked.add("Gautam");
		System.out.println(linked);
		
		linked.set(0, "Prakash");
		
		System.out.println(linked);
		
		
	}

}
