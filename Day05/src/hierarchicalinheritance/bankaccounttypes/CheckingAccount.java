package hierarchicalinheritance.bankaccounttypes;

class CheckingAccount extends BankAccount{
    private int withdrawalLimit;
    CheckingAccount(int accountNumber, double balance,int withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit=withdrawalLimit;
    }
    // method to display Checking Account type
    public void displayAccountType() {
        System.out.println("Account Type : Checking Account ");
        super.displayAccountInfo();
        System.out.println("Withdrawal Limit : " + withdrawalLimit);
    }
}