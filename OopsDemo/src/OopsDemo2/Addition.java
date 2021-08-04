package OopsDemo2;

public class Addition {

	
	void add()
	{
		System.out.println("Method Overloading Demo");
	}
	
	void add(int a,int b)
	{
		System.out.println("The Addition of 2 nos is :"+(a+b));
	}
	
	void add(float a,float b)
	{
		System.out.println("The Addition of 2 float no is :"+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("The Addition of 3 no is :"+(a+b+c));
	}
	
	void add(String s1,String s2)
	{
		System.out.println("The Addition of 2 strings"+(s1+2));
	}
}
