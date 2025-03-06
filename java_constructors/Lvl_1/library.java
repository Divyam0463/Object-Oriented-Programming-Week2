public class library {
  String title ; 
  String author ; 
  int price ; 
  boolean availability ; 

  public library(String title , String author , int price , boolean availability){
    this.title = title; 
    this.author = author; 
    this.price = price ;
    this.availability = availability ; 
  }

  void borrow(){
    System.out.println("book borrowed: "+this.title+"\n");
    this.availability = false ; 
  }

  void display(){
    if (availability) {
      System.out.println("Available: ");
      System.out.println("book: "+this.title);
      System.out.println("author: "+this.author);
      System.out.println("price: "+this.price+"\n");
    }
    else{
      System.out.println(this.title + " Book not available.");
    }
  }
  public static void main(String[] args) {
    library book1 = new library("RDPD", "Robert kiyosaki", 499, true) ; 
    library book2 = new library("psychology", "divyam", 200, true) ; 

    book2.borrow();

    book1.display();
    book2.display();
  }
}
