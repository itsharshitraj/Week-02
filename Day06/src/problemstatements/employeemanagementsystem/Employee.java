package problemstatements.employeemanagementsystem;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

       public Employee(String employeeId, String name, double baseSalary){
           this.employeeId = employeeId;
           this.name = name;
           this.baseSalary = baseSalary;
       }
       // getter and setter
         public String getEmployeeId() {
    return employeeId;
}
     public String getName() {
           return name;
     }

     public double getBaseSalary() {
           return baseSalary;
     }

     public void setBaseSalary(double baseSalary){
           this.baseSalary = baseSalary;
     }
       // abstract method
       public abstract double calculateSalary();

       // concrete method
      public void displayDetails(){
          System.out.println("Employee Id: " + employeeId);
          System.out.println("Name: " + name);
          System.out.println("Base salary: " + baseSalary);
      }
}
