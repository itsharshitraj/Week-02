public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Display Static Library Name
        Book.displayLibraryName();
        System.out.println("");
		
        // create object
		Book book1 = new Book("J.K rollings","Harry Potter","244-15:");
		Book book2 = new Book("Munshi Premchand","Godan","244-16");
		
		// display the book details
        System.out.println("Book1 details: ");
        book1.displayBookDetails();
        System.out.println("");
		
        System.out.println("Book2 details: ");
        book2.displayBookDetails();
		
		
        // Demonstrate instanceof
        System.out.println("\nInstanceof Check:");
        if (book1 instanceof Book) {
            System.out.println("book1 is an instance of the Book class.");
			} else {
            System.out.println("book1 is not an instance of the Book class.");
		}
		
		
		
	}
}
class Book{
    // Static variables
    private static String libraryName="Symphony Library";
	
    // instance variables
    private String author;
    private String title;
    private final String isbn;
	
    public Book( String author, String title,String isbn ){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
	}
    // static method to display the library name
    public static void displayLibraryName(){
	System.out.println("Library name : " + libraryName);
    }
    // check isnstance of the library
    public  void displayBookDetails(){
	if(this instanceof Book){
	System.out.println("Book Title : " + title);
	System.out.println("Author Name : " + author);
	System.out.println("ISBN : " + isbn);
	}else{
	System.out.println("This is not a Book object");
	}
    }
	}
		