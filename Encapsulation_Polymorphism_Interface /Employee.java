abstract class Employee {
  int employeeId;
  String name;
  double baseSalary;

  public Employee(int employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;

  }

  abstract void calculateSalary();

  public void displayDetails() {
    System.out.println("id: " + employeeId);
    System.out.println("name: " + name);
  }

  public static void main(String[] args) {
    FullTimeEmployee ft = new FullTimeEmployee(12, "joe", 1200, 8) ; 
    PartTimeEmployee pt = new PartTimeEmployee(45, "helen", 600, 4) ; 

    ft.displayDetails();
    ft.calculateSalary();

    System.out.println();
    pt.displayDetails();
    pt.calculateSalary();
  }
}

class FullTimeEmployee extends Employee {
  int hrs;

  public FullTimeEmployee(int employeeId, String name, double baseSalary, int hrs) {
    super(employeeId, name);
    this.baseSalary = baseSalary;
    this.hrs = hrs;
  }

  @Override
  void calculateSalary() {
    System.out.println("hrs"+hrs);
    System.out.println("Salary: " + baseSalary * hrs);
  }

}
class PartTimeEmployee extends Employee {
  int hrs;

  public PartTimeEmployee(int employeeId, String name, double baseSalary, int hrs) {
    super(employeeId, name);
    this.baseSalary = baseSalary;
    this.hrs = hrs;
  }

  @Override
  void calculateSalary() {
    System.out.println("hrs: "+hrs);
    System.out.println("Salary: " + baseSalary * hrs);
  }

}
