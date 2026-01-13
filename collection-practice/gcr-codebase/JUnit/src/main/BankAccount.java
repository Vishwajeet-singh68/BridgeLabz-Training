package org.junit;

public class BankAccount {
    double balance=0;

     public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(balance<amount)
            throw new IllegalStateException("Insufficient balance!");
        balance-=amount;
    }

    public double getBalance(){
        return balance;
    }
}
