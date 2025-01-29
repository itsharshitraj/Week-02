package assistedproblems.employeemanagementsystem;
class Intern extends Employee {
    private String domain;

    Intern(String name,int id,double salary,String domain){
        super(name,id,salary);

        this.name=name;
        this.id=id;
        this.salary=salary;
        this.domain=domain;
    }

    void displayDetails(){
        System.out.println("Name :" + name);
        System.out.println("Id :" + id);
        System.out.println("Salary :" + salary);
        System.out.println("Domain Language :" + domain);
    }
}



