package GroomingClass;

public class StudentData implements StudentsOrganization 
{
	private String Name;//Data-hiding
	private String Branch;
	private int RollNumber;
	public StudentData (String Name,String Branch,int RollNumber )
	{
		this.Name=Name;
		this.Branch=Branch;
		this.RollNumber=RollNumber;
	}

	public void setBranch(String branch) {
		this.Branch = branch;
	}

	public String getName() {
		return Name;
	}

	public String getBranch() {
		return Branch;
	}

	public int getRollNumber() {
		return RollNumber;
	}
	@Override
	public void completestudentsDetails()
	{
		System.out.println("College Name:" + StudentsOrganization.CollegeName);
		System.out.println("Name :" + getName() + "\n" + "Branch :" + getBranch() +"\n" + "Roll Number :" 
		                   + getRollNumber());
	}
	
}
