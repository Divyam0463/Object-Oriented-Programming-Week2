public class Student {
  String name;
  int rollNumber;
  double marks;

  public Student(String name, int rollNumber, double marks) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.marks = marks;
  }

  char calcGrade(String name, double marks) {
    if (marks <= 40)
      return 'F';

    else if (marks > 40 && marks <= 60)
      return 'D';

    else if (marks > 60 && marks <= 70)
      return 'C';

    else if (marks > 70 && marks <= 80)
      return 'B';

    else if (marks > 80)
      return 'A';

    return '\0' ; 
  }

  void displayDetails(String name, int rollNumber, double marks){
    System.out.println("name: "+name);
    System.out.println("rollNumber: "+rollNumber);
    System.out.println("marks: "+marks);
    System.out.println("grade: "+calcGrade(name, marks));
  }

  public static void main(String[] args) {
   Student s1 = new Student("raj", 63, 90.5)  ; 
   Student s2 = new Student("rohan", 72, 56.5) ; 

   s1.calcGrade(s1.name, s1.marks) ; 
   s1.calcGrade(s2.name, s2.marks) ; 

   s1.displayDetails(s1.name, s1.rollNumber, s1.marks);
   s1.displayDetails(s2.name, s2.rollNumber, s2.marks);
  }
}