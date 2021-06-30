
public class ObjectIntoWrapperClassess {

	public static void main(String[] args) {
	
		Integer i = new Integer(50);
		int a = i.intValue();// converting object to Integer
		int j=i;
		System.out.println(a);
		System.out.println(j);
		
		Double dob= new Double(10.6);
		double ble = dob.doubleValue();
		System.out.println(ble);

	}

}
