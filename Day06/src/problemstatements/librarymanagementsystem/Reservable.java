package problemstatements.librarymanagementsystem;

interface Reservable {
    void reserveItem(String borrower);

    boolean checkAvailability();
}
