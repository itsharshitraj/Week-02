package hierarchicalinheritance.bankaccounttypes;

class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // method to display Bank Account
    public void displayAccountInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}
