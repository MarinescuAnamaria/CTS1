package sem4ctsBanking;

public abstract class BankAccount {
    protected String iban;
    protected long balance;
    protected Persoana accountHolder;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Persoana getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Persoana accountHolder) {
        this.accountHolder = accountHolder;
    }
}
