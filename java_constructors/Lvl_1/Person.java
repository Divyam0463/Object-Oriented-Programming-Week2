public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Copy constructor with object passed
  public Person(Person other) {
    this.name = other.name;
    this.age = other.age;
  }

  public static void main(String[] args) {
    Person orginalPerson = new Person("raj", 20);
    Person copyPerson = new Person(orginalPerson);

    System.out.println("original: " + orginalPerson.name);
    System.out.println("Copy: " + copyPerson.name);
  }
}
