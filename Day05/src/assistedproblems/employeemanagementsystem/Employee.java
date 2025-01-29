package assistedproblems.employeemanagementsystem;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    // method to display details
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
}