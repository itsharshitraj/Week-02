package singleinheritance.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // AUTHOR OBJECT
        Author author = new Author("Harry Potter" ,
                2001,
                " J.K Rollings",
                "J.K. Rollings is the author of the book " );
        author.displayInfo();
    }
}
