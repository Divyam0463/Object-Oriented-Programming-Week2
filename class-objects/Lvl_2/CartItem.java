class CartItem {
  String itemName ; 
  int price ; 
  int quantity ; 

  public CartItem(){
    this.itemName = "" ; 
    this.price = 0 ; 
    this.quantity = 0 ; 
  }

  void addItem(String itemName,int price , int quantity){
    this.itemName += (itemName+" " ); 
    this.price += price ; 
    this.quantity += quantity ; 
  }

  void removeItem(String itemName  ,int quantity){

    if (this.quantity == quantity) {
     this.itemName = this.itemName.replaceAll(itemName, "") ;  
    }
    this.price -= price ; 
    this.quantity -= quantity ; 
  }

  void displayDetails(){
    System.out.println("itemName: "+itemName);
    System.out.println("total cost: "+quantity*price);
  }

  public static void main(String[] args) {
    CartItem ct = new CartItem() ; 
    ct.addItem("brush" , 20 , 2) ;
    ct.addItem("comb" , 20 , 5) ; 
    ct.removeItem("comb" ,  5) ; 

    ct.addItem("wax" , 50 , 2) ;
    
    ct.displayDetails() ; 
  }
}
