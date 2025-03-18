class Course {
  String courseName;
  int duration; // in weeks

  public Course(String courseName, int duration) {
      this.courseName = courseName;
      this.duration = duration;
  }

  public void displayCourseInfo() {
      System.out.println("Course: " + courseName);
      System.out.println("Duration: " + duration + " weeks");
  }
}

class OnlineCourse extends Course {
  String platform;
  boolean isRecorded;

  public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
      super(courseName, duration);
      this.platform = platform;
      this.isRecorded = isRecorded;
  }

  @Override
  public void displayCourseInfo() {
      super.displayCourseInfo();
      System.out.println("Platform: " + platform);
      System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
  }
}

class PaidOnlineCourse extends OnlineCourse {
  double fee;
  double discount; // in percentage

  public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
      super(courseName, duration, platform, isRecorded);
      this.fee = fee;
      this.discount = discount;
  }

  @Override
  public void displayCourseInfo() {
      super.displayCourseInfo();
      System.out.println("Fee: $" + fee);
      System.out.println("Discount: " + discount + "%");
  }
}

public class CourseManagement {
  public static void main(String[] args) {
      Course basicCourse = new Course("Intro to Java", 4);
      OnlineCourse onlineCourse = new OnlineCourse("Web Development", 6, "Udemy", true);
      PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Data Science", 8, "Coursera", true, 299.99, 20);

      basicCourse.displayCourseInfo();
      System.out.println();

      onlineCourse.displayCourseInfo();
      System.out.println();

      paidCourse.displayCourseInfo();
  }
}

