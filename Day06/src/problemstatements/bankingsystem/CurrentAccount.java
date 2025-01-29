package problemstatements.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // Current accounts typically do not earn interest
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of " + amount + " applied for current account.");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3; // Loan eligibility is thrice the balance
    }

    public void showAccountDetails() {
        super.showAccountDetails();
        System.out.println("OverDraft Limit : " + overdraftLimit);
    }
}

