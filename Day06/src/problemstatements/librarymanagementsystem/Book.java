package problemstatements.librarymanagementsystem;

class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 10; // 10 days duration
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book reserve for " + borrower + ".");
        } else {
            System.out.println("Book is already reserved. ");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
