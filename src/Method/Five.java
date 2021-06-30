package Method;

public class Five {
	
	public static void print()
	{
		System.out.println("My name is Adarsh");
	}
	void add()
	{
		int a=10, b=20;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		Five f= new Five();
		f.add();
		Five.print();
		


	}

}
