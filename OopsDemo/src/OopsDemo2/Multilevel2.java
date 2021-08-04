package OopsDemo2;

class Staff
{
	int empId;
    String name;
    float salary,hra;
    
    
	public Staff(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
    
    void getHRA()
    {
    	hra=(salary*60)/100;
    	System.out.println("HRA :"+hra);
    }
    
    void display()
    {
    	System.out.println("****** Employee Details *******");
    	System.out.println(empId+" "+name+" "+salary);
    }
    
}

class Manager extends Staff
{
	float da,gross;

	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	
	void getDA()
	{
		da=(salary*80)/100;
		System.out.println("DA is :"+da);
	
	}
	void getGross()
	{
		gross=salary+hra+da;
		System.out.println("Gross Salary of Director is :"+gross);
	}
	
}

class Director extends Manager
{
	private float ta,gross;
	
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	void getTA()
	{
		ta=(salary*30)/100;
		System.out.println("TA is :"+ta);
	}
	void getGross()
	{
		gross=salary+hra+da+ta;
		System.out.println("Gross Salary of Director is :"+gross);
	}
}


public class Multilevel2 {

	public static void main(String[] args) {
		
		Director d1=new Director(101,"Keane",5000);
		
		System.out.println("******* Director Details *******");
		d1.display();
		d1.getHRA();
		d1.getDA();
		d1.getTA();
		d1.getGross();
		
		Manager m1=new Manager(201,"Mary",4000);
		
		System.out.println("******* Manager Details *******");
		m1.display();
		m1.getHRA();
		m1.getDA();
		m1.getGross();
		
		Staff s1=new Staff(301,"Halen",2000);
		System.out.println("******* Staff Details *******");
		s1.display();
		s1.getHRA();
		
	}

}
