import java.util.*;
public class simulateATM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Holder Name :");
		String accountHolder = sc.nextLine();
		
		System.out.println("Enter Account Number :");
		long accountNumber = sc.nextLong();
		
		System.out.println("Enter Account Balance :");
		double balance = sc.nextDouble();
		
		BankAccount bankAccount = new BankAccount(accountHolder,accountNumber,balance);
		bankAccount.displayCurrentBalance();
		
		// calling deposit method
		bankAccount.depositMoney(500);
		bankAccount.displayCurrentBalance();
		
		// calling withdrawing money method
		bankAccount.withdrawMoney(400);
		bankAccount.displayCurrentBalance();
		
		// current balance method  
		bankAccount.displayCurrentBalance();
		
	}}
	
	class BankAccount{
		private String accountHolder;
		private long accountNumber;
		private double balance;
		
		// Constructor
		BankAccount(String accountHolder,long accountNumber,double balance){
			this.accountHolder=accountHolder;
			this.accountNumber=accountNumber;
			this.balance=balance;
		}
		// method to deposit
		public void depositMoney(double amount){
		    if(amount>0){
				balance=balance+amount;
				System.out.println("Amount Deposited successfully :"+amount);
				}else{
				System.out.println("Amount not deposited");
			}
		}
		
		// method for withdrawing money
		public void withdrawMoney(double amount){
			if(amount>0 && amount<=balance){
				balance=balance-amount;
				System.out.println("Withdrawing money : "+amount);
				}else{
			System.out.println("Sufficient balance not exists");}
		}
		
		// method for display current balance
		public void displayCurrentBalance(){
			System.out.println("Account Holder Name :"+accountHolder);
			System.out.println("Account Number : "+accountNumber);
			
		System.out.println("current balance is : "+balance);}
		
		
		
		
	}	