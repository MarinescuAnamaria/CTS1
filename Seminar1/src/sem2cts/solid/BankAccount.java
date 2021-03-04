package sem2cts.solid;

public class BankAccount {
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
	
	public void withdraw(long amount)
	{
		System.out.println(amount);
		balance-=amount;
		
	}
	public void deposit(long amount)
	{
		balance+=amount;
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
