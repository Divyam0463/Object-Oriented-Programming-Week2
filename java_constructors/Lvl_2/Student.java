class Student {
  public int rollNumber;
  protected String name;
  private double CGPA;

  Student(int rollNumber, String name, double CGPA) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.CGPA = CGPA;
  }

  public double changeCGPA(double CGPA) {
    this.CGPA = CGPA;
    return CGPA;
  }

  public static void main(String[] args) {
    Student s1 = new Student(21, "raj", 8.89);
    System.out.println("CGPA: " + s1.CGPA);
    s1.changeCGPA(9.9);
    System.out.println("New CGPA: " + s1.CGPA);

    PostGraduate ps1 = new PostGraduate(22 , "rohan" , 9);
    ps1.displayName();
  }
}
class PostGraduate extends Student {
  public PostGraduate(int rollNumber , String name , double CGPA) {
    super(rollNumber , name , CGPA); 
  }

  public void displayName() {
    System.out.println("Name derived from the main class: " + name);
    System.out.println(rollNumber);// Accessing protected memberq
    // System.out.println(CGPA); cant access private members
  }
}
