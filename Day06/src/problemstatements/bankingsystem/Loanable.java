package problemstatements.bankingsystem;

interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}
