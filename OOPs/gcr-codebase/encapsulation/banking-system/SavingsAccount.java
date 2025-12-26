package encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(int accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    @Override
    double calculateInterest() {
        double interest = getBalance()*0.02;
        addInterest(interest);
        return interest;
    }

    @Override
    public boolean applyforLoan(double amount) {
        return amount>=calculateLoanEligibility();
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance()*2;
    }
}
