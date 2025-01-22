public class MobilePhonesDetails{
	public static void main(String args[]){
		String brand="Vivo";
		String model="X5";
		double price=15000;
		
		MobilePhones mobilePhone=new MobilePhones(brand,model,price);
		mobilePhone.displayDetails();
		
	}}
	class MobilePhones{
		String brand;
		String model;
		double price;
		
		// constructor
		MobilePhones(String brand,String model,double price){
			this.brand=brand;
			this.model=model;
			this.price=price;
		}
		// method to display
	    void displayDetails(){
			System.out.print("Brand : " +brand);
			System.out.print(" Model : " +model);
			System.out.print(" price : INR " +price);
		}
	}	