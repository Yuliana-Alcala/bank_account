package project.bankacount;

public class Account {
    
    protected float balance;
    protected int numDeposits;
    protected int numWithdrawals;
    protected float annualInterestRate;
    protected float monthlyFee;

    public Account(float balance, float annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.numDeposits = 0;
        this.numWithdrawals = 0;
        this.monthlyFee = 0;
    }

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            numDeposits++;
        }
    }

    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            numWithdrawals++;
        }
    }

    public void calculateMonthlyInterest() {
        float monthlyInterest = (annualInterestRate / 12) * balance;
        balance += monthlyInterest;
    }

    public void monthlyStatement() {
        balance -= monthlyFee;
        calculateMonthlyInterest();
    }

    public String printDetails() {
        return String.format("Balance: %.2f, Monthly Fee: %.2f, Deposits: %d, Withdrawals: %d",
                balance, monthlyFee, numDeposits, numWithdrawals);
    }
}
    


