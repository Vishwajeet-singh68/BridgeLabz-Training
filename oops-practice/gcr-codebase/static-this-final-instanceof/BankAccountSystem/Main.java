public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice Johnson", 12345);
        BankAccount account2 = new BankAccount("Bob Smith", 67890);

        if(account1 instanceof BankAccount) {
            System.out.println("account1 is an instance of BankAccount");
        }
        if(account2 instanceof BankAccount) {
            System.out.println("account2 is an instance of BankAccount");
        }

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
