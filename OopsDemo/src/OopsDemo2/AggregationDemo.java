package OopsDemo2;

public class AggregationDemo {

	public static void main(String[] args) 
	{
		Address ad1=new Address("Bengaluru","Karnataka","India",566016);
		Address ad2=new Address("Prague","Austin","Czech",566116);
		
		Student s1=new Student(101,"Ravi",ad1);
		Student s2=new Student(102,"Mike",ad2);
		
		s1.diplay();
		s2.diplay();

	}

}
