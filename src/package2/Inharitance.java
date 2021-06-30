package package2;

public class Inharitance {
	 float salary = 5000;
}
class Programmer extends Inharitance
{
	int bonus = 10000;

	public static void main(String[] args) {
		
		Programmer pr = new Programmer();
		System.out.println("Programmer salary is:" +pr.salary);
		System.out.println("Programmer bonus is:" +pr.bonus);

	}

}
