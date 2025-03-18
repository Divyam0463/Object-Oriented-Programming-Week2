import java.util.ArrayList;
import java.util.List;

// Interface for Taxable Products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
//Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Setters 
    public void setPrice(double price) { this.price = price; }
    public void setName(String name) { this.name = name; }

    // Abstract method for discount calculation
    public abstract double calculateDiscount();

    // Method to calculate final price
    public double getFinalPrice() {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        return price - discount + tax;
    }

    // Display method
    public void displayFinalPrice() {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        System.out.println(name + " (ID: " + productId + ")");
        System.out.println("Base Price: $" + price);
        System.out.println("Discount: $" + discount);
        if (this instanceof Taxable) {
            System.out.println(((Taxable) this).getTaxDetails());
        }
        System.out.println("Final Price: $" + getFinalPrice());
        System.out.println("------------------------------");
    }
}

// (Taxable)
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Tax (18% GST): $" + calculateTax();
    }
}

// (Taxable)
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "Tax (5% GST): $" + calculateTax();
    }
}

//(Non-Taxable)
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}


public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 80000));
        products.add(new Clothing(202, "Jacket", 5000));
        products.add(new Groceries(303, "Rice Bag", 1200));

        //  final price for each product
        for (Product product : products) {
            product.displayFinalPrice();
        }
    }
}
