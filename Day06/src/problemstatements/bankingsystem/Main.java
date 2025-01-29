package problemstatements.bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA12345", "Harshit", 5000, 6.5);
        BankAccount current = new CurrentAccount("CA67890", "Harshit", 200000, 100000);


        System.out.println("Account Details:");
        savings.showAccountDetails();
        System.out.println("Interest: " + savings.calculateInterest());

        if (savings instanceof Loanable) {
            Loanable loanable = (Loanable) savings;
            loanable.applyForLoan(10000);
            System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
        }

        System.out.println("----------------------");

        current.showAccountDetails();
        System.out.println("Interest: " + current.calculateInterest());
        System.out.println("----------------------");

        // Perform transactions
        savings.deposit(1500);
        savings.withdraw(2000);
        System.out.println("----------------------");

        current.withdraw(2500); // Exceeds balance but within overdraft limit
    }
}


