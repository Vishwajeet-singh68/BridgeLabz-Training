public class BankAccount
{
    double Balance;

    public BankAccount(double initialBalance)
    {
        Balance = initialBalance;
    }

    public void deposit(double amount) throws Exception {
        if (amount < 0)
            throw new Exception("Deposit amount cannot be negative");

        Balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > Balance)
            throw new Exception("Insufficient funds.");

        Balance -= amount;
    }
}

