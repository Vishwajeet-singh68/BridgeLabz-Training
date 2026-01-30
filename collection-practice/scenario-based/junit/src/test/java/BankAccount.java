import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void Test_Deposit_ValidAmount() throws Exception {
        BankAccount acc = new BankAccount(1000);

        acc.deposit(500);

        assertEquals(1500, acc.getBalance(), 0.0);
    }

    @Test
    public void Test_Deposit_NegativeAmount() {
        Program acc = new Program(1000);
        String expected = "Deposit amount cannot be negative";
        String actual = "";

        try {
            acc.deposit(-100);
        } catch (RuntimeException e) {
            actual = e.getMessage();
        }

        assertEquals(expected, actual);
    }

    @Test
    public void Test_Withdraw_ValidAmount() {
        Program acc = new Program(1000);

        acc.withdraw(400);

        assertEquals(600, acc.getBalance(), 0.0);
    }

    @Test
    public void Test_Withdraw_InsufficientFunds() {
        Program acc = new Program(500);
        String expected = "Insufficient funds.";
        String actual = "";

        try {
            acc.withdraw(1000);
        } catch (RuntimeException e) {
            actual = e.getMessage();
        }

        assertEquals(expected, actual);
    }
}

