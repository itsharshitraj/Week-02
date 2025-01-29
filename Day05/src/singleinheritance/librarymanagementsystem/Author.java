package singleinheritance.librarymanagementsystem;

class Author extends Book{
    private String name;
    private String bio;

    Author(String title,int publicationYear,String name, String bio){
        super(title,publicationYear );
        this.name = name;
        this.bio = bio;

    }

    // method to display info
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method to display book details
        System.out.println("Author Name: " + name);
        System.out.println("Author bio: " + bio);
    }

}