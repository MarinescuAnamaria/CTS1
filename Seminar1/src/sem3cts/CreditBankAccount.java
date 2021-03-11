package sem3cts;

public class CreditBankAccount implements Receivable {

	private long balance;
	private String iban;
	private Persoana accountHolder;
	
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
