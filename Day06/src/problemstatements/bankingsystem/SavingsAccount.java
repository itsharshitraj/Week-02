package problemstatements.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // abstract method
    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of " + amount + " applied for savings account.");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Loan eligibility is twice the balance
    }

    public void showAccountDetails() {
        super.showAccountDetails();
        System.out.println("loan Eligibility of " + getBalance() + "");
    }

}
