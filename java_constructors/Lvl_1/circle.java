public class circle {
  double rad ; 

  circle(){
    this(0.0) ; //should be very first line of the constructor && calls the parameterized constructor first
    System.out.println("default constructor");
  }
  circle(double rad){
    this.rad = rad ; 
    System.out.println("Parameterised constructor");
  }

  public static void main(String[] args) {
    circle c1 = new circle() ; 
    System.out.println(c1.rad);

    circle c2 = new circle(7.0) ; 
    System.out.println(c2.rad);
  }
}
