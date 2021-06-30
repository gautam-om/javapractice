package Abstract;

public abstract class Bank {
	int amt=100;
	
	public abstract void emplyee();
	
	public void credit()
	{
		System.out.println("Bank-- Credit");
	}
	public void debit()
	{
		System.out.println("Bank-- debit");
	}

}
