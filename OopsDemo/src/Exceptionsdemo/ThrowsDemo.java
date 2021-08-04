package Exceptionsdemo;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		ThrowsDemo T = new ThrowsDemo();
        try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");

	}

}
