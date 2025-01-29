package problemstatements.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M202", "National Geographic", "Various Authors");
        LibraryItem dvd = new DVD("D303", "Inception", "Christopher Nolan");

        // Add items to a list
        LibraryItem[] libraryItems = {book, magazine, dvd};

        // Display details and loan durations
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Reserve items
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Available for reservation: " + reservableItem.checkAvailability());
                reservableItem.reserveItem("John Doe");
                System.out.println("Available after reservation: " + reservableItem.checkAvailability());
            }
            System.out.println("----------------------");
        }
    }
}
