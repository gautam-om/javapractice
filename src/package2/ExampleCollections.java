package package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleCollections {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("OM");
		list.add("Prakash");
		list.add("Gautam");
		
		System.out.println("Elements of list before the operation");
		
		System.out.println(list);
		
		System.out.println("Elements of list before the operation");
		
		Collections.addAll(list, "Pankaj");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}
