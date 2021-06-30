package package2;

public class MethOverloading 
{
	
	 int methOver(int i,int j)
	{
		return i+j;
	}
	 
	 String methOver( String name)
	 {
		 return name;
	 }
	 
	 int methOver(int i, int j, int n)
	 {
		 return i+j+n;
	 }
     
	public static void main(String[] args) 
	{
		MethOverloading mo;
		
		 mo= new MethOverloading();
		
		System.out.println(" Number is " +mo.methOver(10, 5));//By using different numbers of arguments
		System.out.println("Number is " +mo.methOver(10, 5, 8));//By using different numbers of arguments
		System.out.println(" Name is " +mo.methOver("Gautam"));//By using different types of arguments
		
	}

}
