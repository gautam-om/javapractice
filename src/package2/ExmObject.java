package package2;

public class ExmObject {
	
	String name;
	String breed;
	int age;
	String color;
	
	
	public ExmObject(String name,String breed,int age,String color)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.color=color;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}
	
	public String toString()
	{
		return ("Hi my name is "+ this.getName()+
	               ".\nMy breed,age and color are " +
	               this.getBreed()+"," + this.getAge()+
	               ","+ this.getColor());
		
	}

	public static void main(String[] args)
	{
		ExmObject eo = new ExmObject("Tommy","papillon",10,"White");
		System.out.println(eo.toString());

	}

}
