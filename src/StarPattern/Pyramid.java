package StarPattern;

public class Pyramid {

	public static void main(String[] args) 
	{
         for(int i =1; i<=5; i++)
         {
        	 for(int j=5; j>=i; j++)
        	 {
        		 if(j>i)
        		 {
        			 System.out.print(" ");
        		 }
        		 else
        		 {
        			 System.out.println("  *");
        		 }
        		 
        	 }
        	 System.out.println();
         }
	}

}
