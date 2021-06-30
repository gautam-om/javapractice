package StarPattern;

public class PrintName {
	
	/*
	 * static void printPair(int arr[],int n,int sum) { for(int i=0; i<n;i++) {
	 * for(int j=i+1; j<n; j++) { System.out.println("(" +arr[i]+ ","+arr[j]);
	 * 
	 * } } }
	 */

	public static void main(String[] args) 
	{
		String s1="Ravi Teja\n";
		
		String s5=s1 + s1 + s1 + s1 + s1;
		String s10= s5 + s5;
		String s50= s10 + s10 + s10 +s10 +s10;
		
		System.out.println(s50);
		
	
		  String str = "geekss@for@geekss"; 
		  String[] spl = str.split("@",3); 
		  for(String a : spl) 
		  { System.out.println(a); }
		  
		  
		  
	
		 
	}
	

}
