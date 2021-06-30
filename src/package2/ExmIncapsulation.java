package package2;

class ExmIncapsulation {
	
	private String name;
	private int rollNumber;
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}	
class TestEncapsulation
{
	public static void main(String[] args) 
	{
		
		ExmIncapsulation ei = new ExmIncapsulation();
		ei.setName("Om Prakash");
		ei.setRollNumber(11547764);
		ei.setMarks(400/600);
		System.out.println("greek of the Name" +ei.getName());
		System.out.println("greek of the age" +ei.getRollNumber());
		System.out.println("greek of the Mark" +ei.getMarks());
		
		

	}
	
}


