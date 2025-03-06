public class Employee {
  public int employeeID;
  protected String department;
  private double salary;

  Employee(int employeeID, String department) {
    this.employeeID = employeeID;
    this.department = department;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void display() {
    System.out.println("ID : " + employeeID);
    System.out.println("dept : " + department);
  }

  public static void main(String[] args) {
    Manager e = new Manager(2, "HR");

    e.setSalary(40000);

    e.display();
    System.out.println("Salary: " + e.getSalary());
  }
}

class Manager extends Employee {
  Manager(int employeeID, String department) {
    super(employeeID, department);
  }
}
