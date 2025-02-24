import java.util.Scanner;

public class Item {
  int itemCode ; 
  String itemName; //instance-variables
  int price ; 

  public Item(int itemCode,String itemName,int price){
    this.itemCode = itemCode ; 
    this.itemName = itemName ; 
    this.price = price ; 
  }

  void displayDetails(){
    Item item = new Item(itemCode, itemName, price); 
    System.out.println("code: "+item.itemCode);
    System.out.println("name: "+item.itemName);
    System.out.println("price: "+item.price);

  }

  void calc(int quantity ,int price , String itemName){
    System.out.println("total cost of"+itemName+" : "+quantity*price);
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int itemCode = s.nextInt() ; 
    String itemName = s.next(); 
    int price = s.nextInt() ; 

    Item item = new Item(itemCode, itemName, price); 
    item.displayDetails();

    System.out.println("Enter the quantity: ");
    int quantity = s.nextInt() ; 
    item.calc(quantity, price, itemName);
  }
}
