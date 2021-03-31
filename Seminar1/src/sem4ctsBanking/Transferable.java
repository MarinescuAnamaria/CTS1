package sem4ctsBanking;

public interface Transferable  {
  public void transfer(Receivable destination, long amount) throws InsuficientFundsException;
  
}
