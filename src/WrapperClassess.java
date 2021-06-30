
public class WrapperClassess {

	public static void main(String[] args) {
	 int a= 25;
	 String s="35";
    Integer i = Integer.valueOf(a);// converting int into Integerb	 
    Integer k=a;//autoboxing , now compiler will write Integer.valueOf(a) internally
	int j = Integer.parseInt(s);
	System.out.println(i);
	 System.out.println(j);
	 System.out.println(k);
	 
	 byte b=1;
	 Byte byt= new Byte(b);
	 System.out.println("Byte value= "+byt);
	 
	 float c = 10.5f;
	 Float fl = new Float(c);
	 System.out.println("Float value = "+fl);
	 
	 double d=25.5;
	 Double dbl = new Double(d);
	 System.out.println("Bouble value = "+dbl);
	 
	 char ch = 'a';
	 Character chr= new Character(ch);
	 System.out.println("Char value = "+chr);
	 
	 
	}

}
