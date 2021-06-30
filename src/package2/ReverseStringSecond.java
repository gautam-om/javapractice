package package2;

public class ReverseStringSecond {

	public static void main(String[] args) 
	{
		/*
		 * String name = "Om Prakash"; String[] names=name.split(" ");
		 * 
		 * String str="";
		 * 
		 * for(String name1:names) { String rev=""; for(int i=name1.length()-1; i>=0;
		 * i--) { rev=rev+name1.charAt(i); } str=str+rev+" "; } System.out.println(str);
		 */
	  
		String s="Om Prakesh";
		String[] str=s.split("  ");
		String revstr="";
		
		for(String w:str) 		
		{
			String rev="";
			for(int i=w.length()-1; i>=0;i--)
			{
				rev=rev+w.charAt(i);
			}
			revstr=revstr+rev+" ";
		}
		System.out.println(revstr);
	  
	}

}
