package package2;

import java.util.HashSet;
import java.util.Set;

public class DublicateElement {

	public static void main(String[] args) 
	{
		String str[]= {"A","AB","AA","AB","AAA","AAA","A","ABCD"};
		int[] arr = {2,3,4,5,6,7,3,9,6,5,9,2,10};
		int k = arr.length;
		int st=str.length;
		
		System.out.println(k);
		System.out.println("Total count String val = "  + st);
		
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1;j<str.length; j++)
			{
				if(str[i]==str[j]) 
					System.out.println("Dublicate elements " +	str[j] +" ,");
				
			}
		}
		
		for(int i=0; i<k; i++)
		{
			for(int j=i+1;j<k; j++)
			{
				if(arr[i]==arr[j]) 
				System.out.println(arr[j]);
			}
		}
	      System.out.println("********************Hash Set************************");
	      
	      Set<String> data = new HashSet<String>();
	      for(String e : str)
	      {
	    	 if(data.add(e)==false)
	    		 System.out.println(e);
	      }
	      
	      Set<Integer> data1 = new HashSet<Integer>();
	      for(int d : arr)
	      {
	    	 if(data1.add(d))
	    		 System.out.println(d);
	      }
	
	}
	
}

