package GroomingClass;

public class NonArguments {
	
	int id;
	String name;
	int roll;
	String collegeName;
	NonArguments()
	{
		
	}
	NonArguments(String m,int r)
	{
		
	}
	
	NonArguments(int i,String n)
	{
		id=i;
		name=n;
	}
	void dispaly()
	{
		System.out.println(id+" "+name);
		System.out.println(collegeName+" "+roll);
		System.out.println(collegeName+" "+name);
	}
	
	public static void main(String[] args) 
	{
		NonArguments na = new NonArguments(111,"Om");
		NonArguments na1 = new NonArguments();
		na.dispaly();
		na1.dispaly();
	}

}
