package encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(int accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    @Override
    double calculateInterest() {
        double interest = getBalance()*0.04;
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
