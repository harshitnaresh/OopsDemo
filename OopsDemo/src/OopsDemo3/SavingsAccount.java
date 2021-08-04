package OopsDemo3;

public class SavingsAccount extends Account 
{
	double interestRate;

	public SavingsAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.interestRate = interestRate;
	}
	
	
}
