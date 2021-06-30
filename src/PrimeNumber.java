import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args)
	{
		int tem=0;
		for(int i=1; i<=50; i++)
		{
			for(int j=2; j<=i-1; j++)
			{
				if(i%j==0)
				{
					tem=tem+1;
				}
			}
			if(tem==0)
			{
				System.out.println(i);
			}
			else
			{
				tem=0;
			}
			
		}
		
		int num;
		int temp=0;
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=0; i<=num-1; i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(num +" Print prime");
		}
		else
		{
			System.out.println(num+ " in not Prim Number");
		}

	}


}
