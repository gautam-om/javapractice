package package2;

public class ReverseString {

	public static void main(String[] args) 
	{
	   String name= "Pankaj";
	   int leng = name.length();
	   String rev="";
	   for(int i=leng-1; i>=0; i--)
	   {
		   rev=rev+name.charAt(i);
	   }
	   System.out.println(rev);
	   
	   String nam="Rajak";
	   int size = nam.length();
	   String rev1="";
	   for(int i=size-1; i>=0; i--)
	   {
		   rev1=rev1+nam.charAt(i);
	   }
	   
	   System.out.println(rev1);

	}

}
