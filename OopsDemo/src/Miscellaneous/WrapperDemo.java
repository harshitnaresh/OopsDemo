package Miscellaneous;

public class WrapperDemo {

	public static void main(String[] args) {
		
		
		//create primitive types
		int a=5;
		float b=10.10f;
		
		//convert in to wapper objects
		Integer aObj=a; // Auto Boxing -- Convert value type to object
		Float bObj=b;
		
		// create wrapper class object
		Integer x=Integer.valueOf(100);
		Double y=Double.valueOf(2000.00);
		
		// convert into primitive types
		int p=x.intValue(); // Auto Unboxing -- converting object to value type
		double q=y.doubleValue();
		
		System.out.println(p+" "+q);
		System.out.println(aObj+" "+bObj);
		
		char e='a';
		Character objE=e; // boxing
		System.out.println(objE);
		System.out.println(Character.isUpperCase(e));
		
		Double d=200.5;
		Double objD=Double.valueOf(d);
		System.out.println(objD);
		System.out.println(Double.toHexString(15));
		
		String hex="0xff";
		String oct="005";
		
		System.out.println(Integer.decode(oct));
		System.out.println(Integer.decode(hex));
		
		
		
		
		
		

	}

}
