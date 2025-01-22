
public class BookDetails{
	public static void main(String args[]){
		String title="Hebrew";
		String author="julie";
		double price = 60.1;
		
		Book book = new Book(title,author,price);
		book.displayDetails();
	}}
	
	class Book{
		String title;
		String author;
		double price;
		
		// constructor parametrized
		Book(String title,String author,double price){
			this.title=title;
			this.author=author;
			this.price=price;
		}
		// method to display book details
		void displayDetails(){
			System.out.println("The Book title is: "+title+ " author is "+author+ " and price is "+price);
		}
	}		