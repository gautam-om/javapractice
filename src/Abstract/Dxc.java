package Abstract;

abstract class Dxc
{
  abstract void Emplyee();
  
}

class EmplyeeDxc extends Dxc
{
	void Emplyee()
	{
		System.out.println("DXC Id");
	}
}
class EmplyeeCsc extends Dxc
{
	void Emplyee()
	{
		System.out.println("CSC Id");
	}
	
	
}