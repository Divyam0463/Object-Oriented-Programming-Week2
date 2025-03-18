import java.util.ArrayList;
import java.util.List;

// Interface for Discountable
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// Abstract class FoodItem
abstract class FoodItem implements Discountable {
    private String itemName;
    protected double price; // Protected so subclasses can modify it
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice(); // Abstract method

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity;
    }

    @Override
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 50) {
            price -= price * (percentage / 100);
            System.out.println(itemName + " discount applied: " + percentage + "%");
        } else {
            System.out.println("Invalid discount percentage for " + itemName);
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Final Price after Discount: $" + price;
    }
}

// Subclass VegItem
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return price * 1.05; // 5% service charge for Veg items
    }
}

// Subclass NonVegItem
class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return price * 1.1; // 10% additional charge for Non-Veg items
    }
}

// Main class to demonstrate polymorphism
public class OnlineFoodDelivery {
    public static void main(String[] args) {
        List<FoodItem> orderList = new ArrayList<>();
        orderList.add(new VegItem("Paneer Butter Masala", 200, 2));
        orderList.add(new NonVegItem("Chicken Biryani", 350, 1));

        for (FoodItem item : orderList) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: $" + item.calculateTotalPrice());
            item.applyDiscount(10); // Apply 10% discount
            System.out.println(item.getDiscountDetails());
            System.out.println("--------------------------------------");
        }
    }
}

