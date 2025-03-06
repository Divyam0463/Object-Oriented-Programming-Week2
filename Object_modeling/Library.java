import java.util.ArrayList;

public class Library {
  public static void main(String[] args) {
    Book b1 = new Book("abc", "robert") ;
    Book b2 = new Book("xyz", "narasimha") ;
    Book b3 = new Book("qwe", "Bucky") ;

    ArrayList<Book> lib1 = new ArrayList<>() ; 
    lib1.add(b1) ; 
    lib1.add(b2) ; 
    lib1.add(b3) ; 

    for(Book b : lib1){
      b.display() ; 
    }
  }
}

class Book extends Library {
  String title ; 
  String author ; 
  Book(String title , String author){
    this.title = title ; 
    this.author = author ; 
  }
  public void display(){
    System.out.println("title: "+title);
    System.out.println("author: "+author);
    System.out.println("-----------");
  }
}