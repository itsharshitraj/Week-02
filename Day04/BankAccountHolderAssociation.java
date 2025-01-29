import java.util.ArrayList;

public class BankAccountHolderAssociation {
    public static void main(String[] args) {
		// Create Bank
        Bank bank = new Bank("State Bank of India");
		
        // Create Customers
        Customer customer1 = new Customer("Harshit");
        Customer customer2 = new Customer("Raj");
		
        // Open accounts for customers
        bank.openAccount(customer1, "Acc101",10000);
        bank.openAccount(customer1, "Acc102",15000);
		
        bank.openAccount(customer2,"Acc121",19000);
		
        // Display bank customer and thier account
        bank.displayCustomers();
		
        // customer views their balances
        customer1.viewBalances();
	}
	}
	// Account Class
	class Account{
    private String accountNumber;
    private double balance;
	
    // Constructor
    Account(String accountNumber, double initialBalance){
	this.accountNumber = accountNumber;
	this.balance = initialBalance;
    }
    // getter method
    public String getAccountNumber(){
	return accountNumber;
    }
    public double getBalance(){
	return balance;
    }
    // Deposit and Withdraw methods
    public void deposit(double amount){
	if(amount > 0){
	balance += amount;
	}
    }
    public void withdraw(double amount){
	if(amount > 0 && balance >= amount){
	balance -= amount;
	}
    }
	
    @Override
    public String toString(){
	return "Account{" +
	"accountNumber='" + accountNumber + '\'' +
	", balance=" + balance +
	'}';
    }
	}
	
	// Customer class
	class Customer{
    private String name;
    private ArrayList<Account> accounts;
	
    // constructor
    public Customer(String name){
	this.name = name;
	this.accounts = new ArrayList<Account>();
    }
    // Add account to customer
    public void addAccount(Account account){
	accounts.add(account);
    }
	
    // view all balances
    public void viewBalances(){
	System.out.println("Customer: " + name);
	for(Account account : accounts){
	System.out.println(account);
	}
    }
    public String getName(){
	return name;
    }
	}
	
	// Bank class
	
	class Bank{
    private String name;
    private ArrayList<Customer> customers;
	
    // constructor
    public Bank(String name){
	this.name=name;
	this.customers=new ArrayList<Customer>();
    }
	
    // open an account for a customer
    public void openAccount(Customer customer,String accountNumber,double initialBalance){
	Account account = new Account(accountNumber,initialBalance);
	customer.addAccount(account);
	
	// customer not added then add them bank customer list
	if(!customers.contains(customer)){
	customers.add(customer);
	}
    }
    // Display all customers and thier accounts
    public void displayCustomers(){
	System.out.println("Bank: "+ name);
	for(Customer customer : customers){
	customer.viewBalances();
	}
	
    }
	}	