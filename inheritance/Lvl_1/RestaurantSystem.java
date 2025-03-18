interface Worker {
  void performDuties();
}

class Person {
  String name;
  int id;

  public Person(String name, int id) {
      this.name = name;
      this.id = id;
  }

  public void displayDetails() {
      System.out.println("Name: " + name);
      System.out.println("ID: " + id);
  }
}

class Chef extends Person implements Worker {
  String specialty;

  public Chef(String name, int id, String specialty) {
      super(name, id);
      this.specialty = specialty;
  }

  @Override
  public void performDuties() {
      System.out.println("Preparing and cooking meals, specializing in " + specialty + ".");
  }
}

class Waiter extends Person implements Worker {
  int tablesAssigned;

  public Waiter(String name, int id, int tablesAssigned) {
      super(name, id);
      this.tablesAssigned = tablesAssigned;
  }

  @Override
  public void performDuties() {
      System.out.println("Serving customers and managing " + tablesAssigned + " tables.");
  }
}

public class RestaurantSystem {
  public static void main(String[] args) {
      Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
      Waiter waiter = new Waiter("James", 202, 5);

      chef.displayDetails();
      chef.performDuties();
      System.out.println();

      waiter.displayDetails();
      waiter.performDuties();
  }
}

