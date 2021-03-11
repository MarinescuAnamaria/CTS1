package sem3cts;

public class CreditBankAccount extends BankAccount implements Receivable {


	
	public CreditBankAccount(String iban, Persoana accountHolder, long balance)
	{
		this.iban=iban;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	

	@Override
	public void deposit(long amount) {
		this.balance=+amount;

	}

}
