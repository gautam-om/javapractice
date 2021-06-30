package interview_QuationAnswer;

public class StringEachWordReverse {

	public static void main(String[] args) {
		
		
		/*String name="Om Prakesh";
		String[] name1=name.split(" ");
		String revstr="";
		
		for(String n:name1)
		{
			String rev="";
			for(int i=n.length()-1; i>=0; i--)
			{
				rev=rev+n.charAt(i);
			}
			revstr=revstr+rev+" ";
		}
		System.out.println(revstr);
	}*/
		
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
