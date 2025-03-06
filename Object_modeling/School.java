import java.util.ArrayList;

class School {
  private String schoolName;
  private ArrayList<Student> students;

  public School(String schoolName) {
    this.schoolName = schoolName;
    this.students = new ArrayList<>();
  }

  public String getSchoolName() {
    return schoolName;
  }

  public void addStudent(Student s) {
    if (!students.contains(s)) {
      students.add(s);
    }
  }

  public void display() {
    for (Student student : students) {
      System.out.println(student);
    }
  }

  public static void main(String[] args) {
    School school = new School("SDSS");

    Student s1 = new Student("Divyam");
    Student s2 = new Student("Vihaan");

    Course c1 = new Course("DSA") ; 
    Course c2 = new Course("digital-marketing") ; 
    Course c3 = new Course("AI") ; 

    school.addStudent(s2);// adding students in the school list
    school.addStudent(s1);

    s1.addCourse(c3);
    s1.addCourse(c2);
    s2.addCourse(c1);

    school.display();
  }
}

class Student {
  private String studentName;
  private ArrayList<Course> courses;

  Student(String studentName) {
    this.studentName = studentName;
    this.courses = new ArrayList<>();
  }

  public String getName() {
    return studentName;
  }

  public void addCourse(Course c) {
    courses.add(c);
  }

  @Override
  public String toString() {
    String result = "Student : " + getName() + " \nCourses: ";
    for (Course c : courses) {
      result += c.getName()+" " ; 
    }
    return result ; 
  }
}

class Course {
  String CourseName;

  Course(String CourseName) {
    this.CourseName = CourseName;
  }

  public String getName() {
    return CourseName;
  }
}
