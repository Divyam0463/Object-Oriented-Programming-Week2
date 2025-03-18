class Employee {
  String name;
  int empId;
  double salary;

  public Employee(String name, int empId, double salary) {
    this.name = name;
    this.empId = empId;
    this.salary = salary;
  }

  public static void main(String[] args) {
    Intern intern = new Intern("joe", 10, 10000, 1) ; 
    Manager manager = new Manager("helem", 12, 700, 10) ; 
    Developer developer = new Developer("gwen", 67, 23000, "java") ;

    intern.displayDetails();
    manager.displayDetails();
    developer.displayDetails();
  }
}

class Manager extends Employee {
  int teamSize;

  public Manager(String name, int empid, double salary, int teamSize) {
    super(name, empid, salary);
    this.teamSize = teamSize;
  }

  public void displayDetails() {
    System.out.println("name: "+name+", teamSize: "+teamSize);
  }
}

class Developer extends Employee {
  String programmingLanguage;

  public Developer(String name, int empId, double salary, String programmingLanguage) {
      super(name, empId, salary);
      this.programmingLanguage = programmingLanguage;
  }

  public void displayDetails() {
    System.out.println("name: "+name+", duration: "+programmingLanguage);
  }
}

class Intern extends Employee {
  int duration;

  public Intern(String name, int empId, double salary, int duration) {
      super(name, empId, salary);
      this.duration = duration;
  }

  public void displayDetails() {
      System.out.println("name: "+name+", duration: "+duration);
  }
}
