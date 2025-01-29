package assistedproblems.employeemanagementsystem;

class Developer extends Employee {
    private String programmingLanguage;
    Developer(String name,int id,double salary,String programmingLanguage){
        super(name, id, salary);
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.programmingLanguage=programmingLanguage;
    }

    void displayDetails(){
        System.out.println("Name :" + name);
        System.out.println("Id :" + id);
        System.out.println("Salary :" + salary);
        System.out.println("Programming Language :" + programmingLanguage);
    }
}
