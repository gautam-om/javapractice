package package2;

abstract class Vehicale 
{	
	abstract void start();
	
}

class Car extends Vehicale
{
	void start()
	
	{
		System.out.println("start with key");
	}
}
class Scooter extends Vehicale
{
	void start() 
	{
		System.out.println("start with key");
	}

	public static void main(String[] args)
	{
		Car c = new Car();
		c.start();
		
		Scooter s = new Scooter();
		s.start();
	}
	

}
