package package2;

public class Student {
	int roll;
	String Collegename;
	String Name;
	
	Student(int roll,String Collegename,String Name)
	{
		this.Collegename=Collegename;
		this.roll=roll;
		this.Name=Name;
	}
	
	//public String toString()
	//{
	//	return Collegename+" "+roll+" "+Name;
		
	//}

	public static void main(String[] args) 
	{
		Student s1= new Student(1008, "Om", "REC Bijnore");
		Student s2= new Student(1009, "Gautam", "REC Azamghard");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
