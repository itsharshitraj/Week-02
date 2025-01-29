package hierarchicalinheritance.bankaccounttypes;

class SavingAccount extends BankAccount{
    private double interestRate;

    SavingAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    // method to display Saving Account type
    public void displayAccountType() {
        System.out.println("Account Type : Saving Account ");
        super.displayAccountInfo();
        System.out.println("Interest Rate : " + interestRate);
    }
}