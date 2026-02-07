package multithreading;

class BankAccount{
	double balance;
	
	BankAccount(){
		balance = 10_000;
	}
	
	public synchronized void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Balance");
			return;
		} else {
			System.out.println("["+Thread.currentThread().getName()+"]"
					+" Attempting to withdraw "+amount
					);
			balance-=amount;
		}
		
		System.out.println("Transaction successful: "+Thread.currentThread().getName()
				+", Amount: "+amount+", Balance: "+balance
				);
	}
}

class Transaction implements Runnable{
	double withdrawlAmount;
	BankAccount bankAccount;
	
	Transaction(double amount, BankAccount account){
		this.withdrawlAmount = amount;
		this.bankAccount = account;
	}
	
	@Override
	public void run() {
		bankAccount.withdraw(withdrawlAmount);
	}	
}

public class BankingSystem {
	public static void main(String[] args) throws InterruptedException {
		BankAccount account = new BankAccount();
		
		Thread customer1 = new Thread(new Transaction(3000,account),"Customer-1");
		Thread customer2 = new Thread(new Transaction(4000,account),"Customer-2");
		
		customer1.start();
		customer2.start();
	}
}
