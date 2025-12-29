package encapsulation.bankingsystem;

public interface Loanable {
    boolean applyforLoan(double amount);
    double calculateLoanEligibility();
}
