package project.bankacount;

public class CheckingAccount extends Account{
    float overdraft;

    public CheckingAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
        this.overdraft = 0;
    }

    @Override
    public void withdraw(float amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                overdraft += (amount - balance);
                balance = 0;
            }
            numWithdrawals++;
        }
    }

    @Override
    public void deposit(float amount) {
        if (amount > 0) {
            if (overdraft > 0) {
                if (amount >= overdraft) {
                    amount -= overdraft;
                    overdraft = 0;
                } else {
                    overdraft -= amount;
                    amount = 0;
                }
            }
            balance += amount;
            numDeposits++;
        }
    }

    @Override
    public String printDetails() {
        return super.printDetails() + ", Overdraft: " + overdraft;
    }

}
