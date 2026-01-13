package com.test;

import org.junit.BankAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    BankAccount bank=new BankAccount();

    @Test
    public void withdrawTest(){
        try{
            bank.withdraw(1000);
        }
        catch (Exception e){
            assertEquals("Insufficient balance!",e.getMessage());
        }

    }
}
