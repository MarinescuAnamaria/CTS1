package sem3cts;

public class BankAccount implements Account {
	private String iban;
	private double balance;
	private Persoana accountHolder;
	private  String accountHolderAdress;
	
	public BankAccount(String iban, Persoana persoana)
	{
		this.iban=iban;
		this.accountHolder=persoana;
		balance=0;
	}
	
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		if (amount > balance)
			throw new InsuficientFundsException("Insuficient funds " + balance);
		System.out.println("withdrawing " + amount + " from " + iban);
		balance -= amount;
	}

	@Override
	public void deposit(long amount) {
		System.out.println("Adding " + amount + " to " + iban);
		balance += amount;
	}
	public String getIban() {
		return iban;
	}
	
	
	public double getBalance() {
		return balance;
	}
	

	public Persoana getAccountHolder() {
		return accountHolder;
	}
	

}
