import java.util.Scanner;

public class areaOfcircle {
  double rad  ; 

  public areaOfcircle(double rad){
    this.rad = rad; 
  }

  double area(double rad){
    return (22/7)*rad*rad ; 
  }
  double circumference(double rad){
    return 2*(22/7)*rad ; 
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    double rad = s.nextDouble() ; 

    areaOfcircle circle = new areaOfcircle(rad) ; 
    System.out.println("area: "+circle.area(rad) );
    System.out.println("circumference: "+circle.circumference(rad) );
  }
}
