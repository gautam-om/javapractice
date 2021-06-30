package package2;

public class Employee {
	
      void print_om()
      {
    	  System.out.println("Om");
      }
}
	class ProgrammerL extends Employee
	{
		void print_prakash()
		{
			System.out.println("Prakash");
		}
		
	}
		
	class Tester extends ProgrammerL
	{
		void print_gautam()
		{
			System.out.println("Gautam");
		}
	

	public static void main(String[] args)
	{
		/*ProgrammerL t= new ProgrammerL();
		t.print_om();    // single Inheritance 
		t.print_prakash();
		t.pr*/
		
		Tester te = new Tester();
		te.print_om();
		te.print_prakash();  //Multilevel Inheritance 
		te.print_gautam();
				
	}
	

}

