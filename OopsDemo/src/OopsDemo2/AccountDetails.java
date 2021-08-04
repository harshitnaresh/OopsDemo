package OopsDemo2;

public class AccountDetails extends SavingsBank //Child class of Savings Bank
{

	int withdrawl,deposit,finalBalance;
	
	public AccountDetails(int accNo, String name, int mb, int b,int w,int dep) {
		super(accNo, name, mb, b);
		this.withdrawl=w;
		this.deposit=dep;
		
	}
	
	void display()
	{
		super.display(); //invoke sb
		System.out.println("Deposit: "+deposit);
		System.out.println("Withdrawls:"+withdrawl);
		finalBalance=(balance+deposit)-withdrawl;
		System.out.println("Final Balance:" + finalBalance);
		
	}
	
}
