
import java.util.ArrayList;

class Company {
  private String Companyname;
  private ArrayList<Department> dept;

  public Company(String Companyname) {
    this.Companyname = Companyname;
    this.dept = new ArrayList<>();
  }

  public void addDept(String DeptName){
    Department d = new Department(DeptName) ; 
    dept.add(d) ; //adding them to the company arraylist
  }
  public void addEmpToDept(String deptName, String empName) {

    for (Department d : dept) {
      if ( d.getDept().equals(deptName) ) { // will add employees to already created departments
        d.addEmp(empName);
        break ; 
      }
    }
  }

  public void display() {
    for (Department department : dept) {
      System.out.println(department);
    }
  }

  public void deleteCompany() {
    // Setting departments to null, making them eligible for garbage collection
    dept = null;
    System.out.println("Company and all associated departments have been deleted.");
  }

  public static void main(String[] args) {
    Company company = new Company("Nvidia");

    company.addDept("IT");
    company.addDept("HR");
    
    company.addEmpToDept("IT" , "raj");
    company.addEmpToDept("IT" , "rohan");

    // company.deleteCompany() ;
    company.display();
  }
}

class Department {
  private String DepName;
  private ArrayList<Employee> employees;

  public Department(String DepName) {
    this.DepName = DepName;
    this.employees = new ArrayList<>();
  }

  public String getDept(){
    return DepName ; 
  }

  public void addEmp(String empName) {
    Employee e = new Employee(empName); // can only exist with the department ( composition )
    employees.add(e);
  }

  @Override
  public String toString() {
    String result = "Departments : " + DepName + " \nEmployees: ";
    for (Employee e : employees) {
      result += e.getEmpName() + " ";
    }
    return result;
  }
}

class Employee {
  private String empName;

  Employee(String empName) {
    this.empName = empName;
  }

  public String getEmpName() {
    return empName;
  }

}