package sem4ctsBanking;

public class FeeBankAccount extends DebitBankAccount {
	private long fee=2;
	public FeeBankAccount(String iban, Persoana persoana) {
		super(iban, persoana);
	}
	
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		System.out.println("Adding " + fee + " fee to withdrawal");
		super.withdraw(amount + 2);
	}

}
