package package2;

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
	class Print
	{
		public static void main(String[] args)
		{
			Dxc ed = new EmplyeeDxc();
			ed.Emplyee();
			
			EmplyeeCsc ec = new EmplyeeCsc();
			ec.Emplyee();
		}
	}

