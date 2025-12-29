package encapsulation.bankingsystem;

public abstract class BankAccount implements Loanable {
    final int accountNumber;
    private String holderName;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName=holderName;
    }

    public void deposit(int amount){
        balance+=amount;
    }

    public void withdraw(int amount){
        if(amount>=balance) {
            balance-=amount;
            System.out.println("Transaction successful");
        }
        else
            System.out.println("Insufficient balance");
    }

    void addInterest(double interest){
        balance+=interest;
    }

    abstract double calculateInterest();
}
