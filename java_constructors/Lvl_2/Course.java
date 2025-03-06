class Course {
  String courseName;
  int duration ;
  double fee ; 
  static String instituteName = "unknown" ;//for truly sharing it 

  public Course(String courseName , int duration , double fee){
    this.courseName = courseName ; 
    this.duration = duration ; 
    this.fee = fee ;  
  }

  void updateInst(String newName){
    instituteName = newName ; 
  }

  void display(){
    System.out.println("course: "+this.courseName);
    System.out.println("duration: "+this.duration);
    System.out.println("fee: "+this.fee);
    System.out.println("instituteName: "+instituteName);
    System.out.println("-------------------");
  }

  public static void main(String[] args) {
    Course c1 = new Course("Cloud computing", 4, 10000) ; 
    c1.display();
    c1.updateInst("Ducat");
    c1.display();

    Course c2 = new Course("Linux", 2, 5000) ; 
    c2.display();
  } 
}
