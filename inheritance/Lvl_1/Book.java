class Book {
  String title;
  int publicationYear;

  public Book(String title, int publicationYear) {
    this.title = title;
    this.publicationYear = publicationYear;
  }

  public void displayInfo() {
    System.out.println("Title: " + title);
    System.out.println("Publication Year: " + publicationYear);
  }

  public static void main(String[] args) {
    Author author = new Author("Java Programming", 2023, "John Doe", "Expert in Java and Software Development");
    author.displayInfo();
  }
}

class Author extends Book {
  String name;
  String bio;

  public Author(String title, int publicationYear, String name, String bio) {
    super(title, publicationYear);
    this.name = name;
    this.bio = bio;
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.println("Author: " + name);
    System.out.println("Bio: " + bio);
  }
}
