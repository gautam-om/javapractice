package package2;

public class Parent 
{
	void print_Over()
	{
		System.out.println("value is");
	}
}
class Child extends Parent
{
	void print_Over()
	{
		System.out.println("value are");
	}
}
class Subclass extends Parent
{
	void print_over()
	{
		System.out.println("value print");
	}

	public static void main(String[] args) 
	{
		
		 Subclass mo = new Subclass();
		 mo.print_over();
		 

	}

}
