package package2;

public class StringName {

	public static void main(String[] args) {
		String s = "Om Prakash";
		String[] word = s.split(" ");
		String strrev="";
		
		for (String w: word)
		{
			String rev="";
			for (int i = s.length()-1; i>=0; i--)
			{
				rev=rev+w.charAt(i);
			}
			strrev= strrev+rev+" ";
			
		}
		System.out.println(strrev);

	}

}
