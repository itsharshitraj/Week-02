import java.util.ArrayList;
import java.util.ArrayList.*;
public class LibraryBooksAggregation {
    // demonstrate aggregation
	
    public static void main(String[] args) {
		
        // Create book object
        Book book1=new Book("Harry Potter","J.K.Rollings");
        Book book2=new Book("Godan","Munshi Premchand");
		
        // Create Library object
        Library library1=new Library("National Library");
        Library library2=new Library("City Library");
		
        // Add book to library
		library1.addBook(book1);
		library1.addBook(book2);
		
		// same book can exist in another library (aggregation)
		
		library2.addBook(book1);
		library2.addBook(book2);
	
	// Display book in each library
	library1.displayBooks();
	library2.displayBooks();
    }
	}
	// Book Class
	class Book{
    private String title;
    private String author;
	
    // Constructor
	public Book(String title, String author){
	this.title = title;
	this.author = author;
	}
	// getter
	public String getTitle(){
	return title;
	}
	
	public String getAuthor(){
	return author;
	}
	
	// override toString for easy display
	@Override
	public String toString(){
	return "Book{" + "title='" + title + '\'' +
	", author='" + author + '\'' +
	'}';
	}
	}
	
	//Library class
	class Library{
	private String name;
	private ArrayList<Book> books;
	
	// constructor
	public Library(String name){
	this.name = name;
	this.books = new ArrayList<Book>();
	}
	
	// Method to add a book
	public void addBook(Book book){
	books.add(book);
	}
	// method to display books
	public void displayBooks(){
	System.out.println("Books in " + name + " Library:");
	for(Book book : books){
	System.out.println(book);
	}
	}
	}
		