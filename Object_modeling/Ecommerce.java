import java.util.*;

public class Ecommerce {
  public static void main(String[] args) {
    Product product1 = new Product(1, "Laptop", 999.99);
    Product product2 = new Product(2, "Smartphone", 599.99);
    Product product3 = new Product(3, "Headphones", 199.99);

    Customer customer1 = new Customer("Joe") ; 
    Order order1 = new Order(001, customer1) ; //order placed by joe

    order1.addProduct(product1);
    order1.addProduct(product2);

    customer1.placeOrder(order1);

    Order order2 = new Order(002, customer1);
    order2.addProduct(product3);

    customer1.placeOrder(order2);
    System.out.println("Customer1's orders: ");
    for (Order order : customer1.viewOrders()) {
      System.out.println(order);
    }
  }
}

class Order {
  private ArrayList<Product> products;
  private double totalAmount;
  private Customer customer; // for adding all the customers
  private int orderId;

  public Order(int orderId, Customer customer) {
    this.products = new ArrayList<>();
    this.orderId = orderId;
    this.customer = customer;
    this.totalAmount = 0;
  }

  public void addProduct(Product p) {
    this.products.add(p);
    calculateTotal();
  }

  public void removeProduct(Product p) {
    this.products.remove(p);
    calculateTotal();
  }

  private void calculateTotal() {
    this.totalAmount = 0;
    for (Product product : products) {
      this.totalAmount += product.getPrice();
    }
  }

  @Override
  public String toString() {
    String productList = "";
    for (Product product : this.products) {
      productList += product.getName()+" ";
    }

    return "Order ID: " + this.orderId + " | Customer: " + this.customer.getName() + " | Total: " + this.totalAmount + "\nProducts: " + productList;
  }
}

class Customer {
  private String custName;
  private ArrayList<Order> orders;

  Customer(String custName) {
    this.custName = custName;
    this.orders = new ArrayList<>();
  }

  public void placeOrder(Order order) {
    this.orders.add(order);
  }

  public ArrayList<Order> viewOrders() {
    return orders;
  }

  public String getName() {
    return custName;
  }
}

// Product class
class Product {
  private int productId ;
  private String name ;
  private double price ;

  public Product(int productId, String name, double price) {
    this.productId = productId;
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public String getName(){
    return name; 
  }
}
