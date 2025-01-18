package project.bankacount;

public class SavingsAccount extends Account {
    private boolean isActive;

    public SavingsAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
        updateAccountStatus();
    }

    private void updateAccountStatus() {
        isActive = balance >= 10000;
    }

    @Override
    public void deposit(float amount) {
        if (isActive) {
            super.deposit(amount);
            updateAccountStatus();
        }
    }

    @Override
    public void withdraw(float amount) {
        if (isActive && numWithdrawals < 4) {
            super.withdraw(amount);
        } else if (isActive) {
            monthlyFee += 1000; 
            super.withdraw(amount);
        }
        updateAccountStatus();
    }

    @Override
    public void generateMonthlyStatement() {
        super.generateMonthlyStatement();
        updateAccountStatus();
    }

    @Override
    public String printDetails() {
        return super.printDetails() + ", Active: " + isActive;
    }

}
