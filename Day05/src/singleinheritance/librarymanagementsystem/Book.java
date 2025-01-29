package singleinheritance.librarymanagementsystem;

class Book{
    protected String title;
    protected int publicationYear;

    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;

    }
    // method to display info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}