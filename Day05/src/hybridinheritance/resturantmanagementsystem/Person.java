package hybridinheritance.resturantmanagementsystem;

 class Person {
     protected String name;
     protected int id;

     // Constructor
     public Person(String name, int id) {
         this.name = name;
         this.id = id;
     }

     // Method to display basic information
     public void displayInfo() {
         System.out.println("Name: " + name);
         System.out.println("ID: " + id);
     }
}
