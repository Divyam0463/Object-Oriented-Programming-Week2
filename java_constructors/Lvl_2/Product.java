public class Product {
  String productName ; 
  int price ; 
  public static int totalProducts ; 

  Product(String productName , int price , int totalProducts){
    this.productName = productName ; 
    this.price = price ; 
    this.totalProducts += totalProducts ; 
  }

  static void displayTotalProducts(){
    System.out.println("total products: "+totalProducts);
  }
  public static void main(String[] args) {
    Product pro1 = new Product("bag", 300 , 45);
    Product pro2 = new Product("laptop", 3000 , 20); 
    
    displayTotalProducts() ;
  }
}