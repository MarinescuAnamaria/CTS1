package sem3cts;

public interface Transferable  {
  public void transfer(Receivable destination, long amount) throws InsuficientFundsException;
  
}
