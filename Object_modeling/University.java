import java.util.ArrayList;

//faculty - uni -> aggregation
//department - uni -> composition

class University {
  private String uniName;
  private ArrayList<Department> departments;

  University(String uniName) {
    this.uniName = uniName;
    this.departments = new ArrayList<>();
  }

  public void addDeptName(String DeptName) {
    Department d = new Department(DeptName); // composition..
    departments.add(d);
  }

  public void addEmptoDept(String DeptName , Staff empName){
    for (Department d : departments) {
      if (d.getDept().equals(DeptName)) {
        d.addFaculty(empName) ; 
        break ; 
      }
    }
  }

  public void deleteDepartments() {
    departments = null;
    System.out.println("uni is deleted and so are its departments");
  }

  public void display(){
    for (Department department : departments) {
      System.out.println(department);
    }
  }

  public static void main(String[] args) {
    University uni = new University("Chitkara") ; 

    uni.addDeptName("tech");
    uni.addDeptName("finance");

    Staff s1 = new Staff("abc") ; //Aggregation (they act independently)
    Staff s2 = new Staff("xyz") ; 

    uni.addEmptoDept("tech", s1);
    uni.addEmptoDept("finance", s2);

    uni.deleteDepartments(); 
    // uni.display();

    System.out.println(s1.getStaffName());
  }
}

class Department {
  private String deptName;
  private ArrayList<Staff> faculty;

  public Department(String deptName) {
    this.deptName = deptName;
    this.faculty = new ArrayList<>() ; 
  }

  public String getDept(){
    return deptName ; 
  }

  public void addFaculty(Staff staff){
    faculty.add(staff) ; //Adding staff member to this department's faculty
  }

  @Override
  public String toString() {
    String result = "Department of : " + getDept() + " contains staff as : \n" ; 
    for (Staff staff : faculty) {
      result += staff.getStaffName() ; 
    }
    return result ; 
  }
}

class Staff {
  private String staffName;

  Staff(String staffName) {
    this.staffName = staffName;
  }

  public String getStaffName(){
    return staffName ; 
  }
}
