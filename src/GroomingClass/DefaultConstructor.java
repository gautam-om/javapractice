package GroomingClass;

public class DefaultConstructor {
	
	int id;
	String name;
	int roll;
	void display()
	{
		System.out.println(id+" "+name+" "+roll);
	}

	public static void main(String[] args) 
	{
		DefaultConstructor dc = new DefaultConstructor();
		dc.display();
	}

}
