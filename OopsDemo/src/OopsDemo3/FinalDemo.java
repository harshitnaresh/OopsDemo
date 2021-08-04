package OopsDemo3;

class Hello
{
	final void display()
	{
		System.out.println("This is a final Method");
	}
}

class World extends Hello //fianl class cannot be extended
{
	final void display()
	{
		System.out.println("This is a final Method");
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		
		final int AGE=20;
		final float PI=3.142f;
		
		//AGE=30; -- cOMPILATION Error - final variable values cannot be changed
		

	}

}
