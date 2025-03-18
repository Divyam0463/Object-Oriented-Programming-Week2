public class Animal {
  String name ; 
  int age ; 
  void makeSound(){
    System.out.println("Animal is animaling");
  }
  public static void main(String[] args) {
    Dog dog = new Dog() ; 
    dog.makeSound(); 
    Animal wildDog = new Animal() ; 
    wildDog.makeSound();
  }
}

class Dog extends Animal{
  void makeSound(){
    System.out.println("dog is barking");
  }
}

class Cat extends Animal{
  void makeSound(){
    System.out.println("car is meowing");
  }
}
class Bird extends Animal{
  void makeSound(){
    System.out.println("bird is chirping");
  }
}

