public class BankAccountSystem {
    public static void main(String[] args) {
        // Create  bankaccount object
        BankAccount bankAccount1 = new BankAccount("Harshit",07241,75000);
        BankAccount bankAccount2 = new BankAccount("Donald ",0564,90000);
		
        // display account details
        System.out.println("Account1 details:");
        bankAccount1.displayDetails();
		
        System.out.println("------------------------------------------------");
		
        System.out.println("Account2 details:");
        bankAccount2.displayDetails();
		
        System.out.println("------------------------------------------------");
        // display total amount
        BankAccount.getTotalAccounts();
		
        // instance of
        System.out.println("\nInstance of checking:");
        if(bankAccount1 instanceof BankAccount){
		System.out.println("bankaccount1 is an instance of BankAccount");
        } else{
		System.out.println("bankaccount1 is not an instance of BankAccount");
        }
		
		}
		}
		class BankAccount{
		// instance variable
		private String accountHolderName;
		private final int accountNumber;
		private double balance;
		
		// class static variable
		private static String bankName="SBI";
		private static int totalAccount=0;
		
		
		// Constructor
		public BankAccount(String accountHolderName,int accountNumber,double balance ){
		this.accountHolderName = accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
		totalAccount++;
		
		
		}
		//Static method to get total accounts
		public static void getTotalAccounts(){
        System.out.println("Total accounts in " + bankName + " : " + totalAccount);
		}
		// method to display account details
		public  void displayDetails(){
		if(this instanceof BankAccount){
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
		}
		else{
		System.out.println("This is not a Bank Account object");
		}
		}
		}
				