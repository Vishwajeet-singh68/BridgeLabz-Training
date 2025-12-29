package encapsulation.bankingsystem;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(134586, "Vishwajeet"));
        accounts.add(new CurrentAccount(214161, "Amit"));


        for (BankAccount acc : accounts) {
            acc.deposit(5000);
            System.out.println("\nAccount: " + acc.getAccountNumber() +
                    " | Holder: " + acc.getHolderName());
            double interest = acc.calculateInterest();
            System.out.println("Interest Added: " + interest);
            System.out.println("Updated Balance: " + acc.getBalance());

            System.out.println("Loan Eligibility: " + acc.calculateLoanEligibility());
        }
    }
}
