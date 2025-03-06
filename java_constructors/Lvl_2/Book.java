public class Book {
  public int ISBN;
  protected String title;

  private String author;

  public String getAuthor(){ //getter method for the author
    return author ;
  }
  public void setAuthor(String author){ // setter method for the author
    this.author = author ; 
  }

  Book(int ISBN , String title){
    this.ISBN = ISBN ; 
    this.title = title; 
  }

  public void display(){
    System.out.println("title: "+title);
    System.out.println("ISBN: "+ISBN);
    System.out.println("author: "+author);
  }
  public static void main(String[] args) {
    Book b1 = new Book(12, "money") ; 
    Ebook b2 = new Ebook(67, "psychology") ; 

    b2.setAuthor("robert kiyosaki"); // set author to robert for ebook object
    System.out.println("orginal title: "+b2.getAuthor());
    b2.display();
    b1.display() ; 

  }
}

class Ebook extends Book{
  Ebook(int ISBN , String title){
    super(ISBN, title) ; //setting the member variables with some values in constructors for ebook
  }

  public void display(){
    System.out.println("title: "+title);
    System.out.println("ISBN: "+ISBN);
    System.out.println("-------------");
  }
}
