package project.bankacount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testDeposit() {
        Account account = new Account(1000, 0.05f);
        account.deposit(500);
        assertEquals(1500, account.balance, 0.01);
        assertEquals(1, account.numDeposits);
    }

    @Test
    void testWithdrawWithinBalance() {
        Account account = new Account(1000, 0.05f);
        account.withdraw(300);
        assertEquals(700, account.balance, 0.01);
        assertEquals(1, account.numWithdrawals);
    }

    @Test
    void testWithdrawExceedingBalance() {
        Account account = new Account(1000, 0.05f);
        account.withdraw(1200);
        assertEquals(1000, account.balance, 0.01); 
        assertEquals(0, account.numWithdrawals);
    }

    @Test
    public void testAccountCalculateMonthlyInterest() {
        Account account = new Account(12000, 0.06f);
        account.calculateMonthlyInterest();
        assertEquals(12060, account.balance, 0.01);
    }

    @Test
    public void testAccountMonthlyStatement() {
        Account account = new Account(10000, 0.06f);
        account.monthlyFee = 500;
        account.monthlyStatement();
        assertEquals(9547.5, account.balance, 0.01);
    }
}
