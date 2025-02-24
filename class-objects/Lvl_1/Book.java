import java.util.Scanner;

public class Book {
  String title ; 
  String author ; 
  int price ; 

  Book(String title , String author , int price){
    this.title = title ; 
    this.author = author ; 
    this.price = price ; 
  }

  void displayResults(){
    Book book = new Book(title, author, price) ; 
    System.out.println("Title: "+book.title);
    System.out.println("Author: "+book.author);
    System.out.println("Price: "+book.price);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String title = s.nextLine() ; 
    String author = s.nextLine() ; 
    int price = s.nextInt() ;
    s.close();
    
    Book book = new Book(title, author, price) ;
    book.displayResults();
  }
}
