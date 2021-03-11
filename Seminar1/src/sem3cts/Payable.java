package sem3cts;

public interface Payable {
	void withdraw(long amount) throws InsuficientFundsException;
}
