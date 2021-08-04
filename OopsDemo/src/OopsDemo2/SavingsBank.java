package OopsDemo2;

public class SavingsBank extends Account 
{ //Child Class of an Account
	
	private int min_bal; //can access only withib the class
	protected int balance; //can access within the class & in sub class
	
	public SavingsBank(int accNo, String name,int mb,int b) {
		super(accNo, name);
		this.min_bal=mb;
		this.balance=b;
	
	} 

	void display()
	{
		super.display();
		System.out.println("Minimum Balance: "+min_bal);
		System.out.println("Saving Balance:"+balance);	
	}
}
