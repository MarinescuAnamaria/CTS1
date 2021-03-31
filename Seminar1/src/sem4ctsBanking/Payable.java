package sem4ctsBanking;

public interface Payable {
	void withdraw(long amount) throws InsuficientFundsException;
}
