public class book {
  String title ; 
  String author ; 
  int price; 

  public book(){
    System.out.println("this is the default constructor..");
  }
    public book(String title , String author , int price) {
      this.title = title ; 
      this.author = author ; 
      this.price = price ; 
      System.out.println("this is the parameterised constructor..");
    }
  
  public static void main(String[] args) {
    book b1 = new book() ; 
    System.out.println(b1.author);

    book b2 = new book("Dsa using java" , "Narasimha" , 630) ; 
    System.out.println(b2.author);
  }
}