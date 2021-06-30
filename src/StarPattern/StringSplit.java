package StarPattern;

public class StringSplit {

	public static void main(String[] args)
	{
		/*String s="Java Program";
		String[] str= s.split(" ");
		String rerr="";
		for(String s1: str)
		{
			String rev="";
			for(int i=s1.length()-1; i>=0;i--)
			{
				rev=rev+s1.charAt(i);
			}
			rerr=rerr+rev+" ";
		}
		System.out.println(rerr);
	*/
		
		String str = "123for@&#";
        /*String[] arrOfStr = str.split("digit ", 1);
  
        for (String a : arrOfStr)
            System.out.println(a);*/
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(""+str.charAt(i));
		
	    }
	}
}
