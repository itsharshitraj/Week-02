package assistedproblems.employeemanagementsystem;

class Manager extends Employee {
    private int teamSize;

    Manager(String name,int id,double salary,int teamSize){
        super(name,id,salary);
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.teamSize = teamSize;
    }
    void displayDetails() {
        System.out.println("Name :" + name);
        System.out.println("Id :" + id);
        System.out.println("Salary :" + salary);
        System.out.println("Team Size :" + teamSize);

    }
}