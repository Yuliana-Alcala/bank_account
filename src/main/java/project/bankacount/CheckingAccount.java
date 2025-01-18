package project.bankacount;

public class CheckingAccount extends Account{
    private float overdraft;

    public CheckingAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
        this.overdraft = 0;
    }

    @Override
    public void withdraw(float amount) {
        if (amount > balance) {
            overdraft += amount - balance;
            balance = 0;
        } else {
            balance -= amount;
        }
        numWithdrawals++;
    }

    @Override
    public void deposit(float amount) {
        if (overdraft > 0) {
            float remaining = overdraft - amount;
            if (remaining < 0) {
                balance += -remaining;
                overdraft = 0;
            } else {
                overdraft = remaining;
            }
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public String printDetails() {
        return super.printDetails() + ", Overdraft: " + overdraft;
    }

}
