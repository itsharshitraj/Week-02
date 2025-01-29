package hierarchicalinheritance.bankaccounttypes;

public class BankAccountTypes {
    public static void main(String[] args) {

        // Saving account object
        SavingAccount account1 = new SavingAccount(
                07241,
                258700,
                8
        );
        account1.displayAccountType();

        System.out.println("");

        // Checking account object
        CheckingAccount account2 = new CheckingAccount(
                07241,
                258700,
                25000
        );
        account2.displayAccountType();

        System.out.println("");

        // Checking account object
        FixedDepositAccount account3 = new FixedDepositAccount(
                07241,
                258700,
                5.8
        );
        account3.displayAccountType();
    }
}
