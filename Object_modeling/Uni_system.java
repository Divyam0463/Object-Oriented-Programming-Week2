import java.util.ArrayList;

public class Uni_system {
  public static void main(String[] args) {
    Student s1 =new Student("joe", 11) ; 
    Student s2 =new Student("may", 17) ; 

    Course c1= new Course("DSA") ; 
    Course c2= new Course("E-marketing") ; 
    Course c3= new Course("AI") ; 

    Professor p1 = new Professor("murthy") ; 
    Professor p2 = new Professor("keith") ; 

    s1.enrollCourse(c3);
    s1.enrollCourse(c1);

    s2.enrollCourse(c2);

    c1.assignProfessor(p1);
    c3.assignProfessor(p2);
    
    System.out.println(s1.getName() + " is enrolled in the following courses:");
    System.out.println(s1.getCourses());

    System.out.println(s2.getName() + " is enrolled in the following courses:");
    System.out.println(s2.getCourses());

    System.out.println("\n"+c1.getName() + " is taught by: " + c1.getPro_name());
    System.out.println(c3.getName() + " is taught by: " + c3.getPro_name());
  }
}

class Student {
  private String name ; 
  private int id ; 
  private ArrayList<Course> courses ; 

  public Student(String name , int id){
    this.name = name ; 
    this.id = id ; 
    this.courses = new ArrayList<>() ; 
  }

  public String getName(){
    return this.name ;
  }

  public void enrollCourse(Course course){
    this.courses.add(course) ; 
  }

  public ArrayList getCourses(){
    return this.courses ; 
  }
}

class Course{
  private String course_name ; 
  private Professor professor ; 

  public Course(String course_name){
    this.course_name = course_name ; 
  }

  public String getName(){
    return course_name ; 
  }

  public void assignProfessor(Professor p){
    this.professor = p ; 
  }

  public String getPro_name(){
    return professor.getName() ; 
  }

  @Override
  public String toString(){
    return course_name ; 
  }
}

class Professor{
  private String pro_name ;

  Professor(String pro_name){
    this.pro_name = pro_name ; 
  }

  public String getName(){
    return pro_name ;
  }
}
