import java.util.Scanner;

public class Employee {
  String name ; 
  int id; 
  double Salary ; 

  public Employee(String name ,int id ,double Salary){
    this.name = name ; 
    this.id = id ; 
    this.Salary = Salary ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String name = s.nextLine() ; 
    int id = s.nextInt() ; 
    double Salary = s.nextDouble() ; 
    s.close();

    Employee emp = new Employee(name, id, Salary) ; 

    System.out.println("name: "+emp.name);
    System.out.println("id: "+emp.id);
    System.out.println("salary: "+emp.Salary);
  }
}