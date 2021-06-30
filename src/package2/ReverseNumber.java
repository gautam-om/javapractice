package package2;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int no=10002,rem,rev=0;
		while(no!=0)
		{
			rem=no%10;
			rev= rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
		
		int n=102,rem1,rev1=0;;
		while(n!=0)
		{
			rem1=n%10;
			rev1=rev1*10+rem1;
			n=n/10;
			
		}
	
		System.out.println(rev1);
	}

}
