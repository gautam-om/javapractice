package package2;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int a=4568, rem;
		
		int rev=0;
		
		while(a!=0) 
		{
			rem=a%10;
			rev= rev*10+rem;
			a= a/10;
			
			
		}
		
		System.out.println(rev);

	}

	
}
