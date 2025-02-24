public class MobilePhone {
  String brand;
  String model;
  double price;

  public MobilePhone(String brand, String model, double price) {
      this.brand = brand;
      this.model = model;
      this.price = price;
  }

  public void displayDetails() {
      System.out.println("Brand: " + this.brand);
      System.out.println("Model: " + this.model);
      System.out.println("Price: rs." + this.price); 
      System.out.println("--------------------"); // Separator for multiple phones
  }

  public static void main(String[] args) {
      MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 99999.99);
      MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 89999.99);
    
      phone1.displayDetails();
      phone2.displayDetails();

      //accessing individual attributes:
      System.out.println("First phone's brand: " + phone1.brand); 
  }
}