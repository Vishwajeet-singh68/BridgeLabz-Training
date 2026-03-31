public class BankAccount {
    private static String bankName="State Bank of India";
    private static int totalAccounts=0;

    String accountHolderName;
    final int accountNumeber;

    public BankAccount(String accountHolderName, int accountNumeber) {
        this.accountHolderName = accountHolderName;
        this.accountNumeber = accountNumeber;
        totalAccounts++;
    }
    
    public static int getTotalAccounts(){
        return totalAccounts;
    }

    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumeber);
    }
}