package problemstatements.librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 5; // Loan duration for DVDs is 5 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD reserved successfully for " + borrower + ".");
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}