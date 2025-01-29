package hierarchicalinheritance.bankaccounttypes;

class FixedDepositAccount extends BankAccount{
    private double fixedInterestRate;
    FixedDepositAccount(int accountNumber, double balance,double fixedInterestRate){
        super(accountNumber, balance);
        this.fixedInterestRate=fixedInterestRate;
    }
    // method to display fixed deposit account
    public void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account ");
        super.displayAccountInfo();
        System.out.println("FD rate: " + fixedInterestRate);
    }
}