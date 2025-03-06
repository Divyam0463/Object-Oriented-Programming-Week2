class CarRental {
  String customerName ; 
  String carModel ; 
  int rentalDays ; 
  int costPerday = 500 ; 

  public CarRental(String customerName, String carModel, int rentalDays){
    this.customerName = customerName ; 
    this.carModel = carModel ; 
    this.rentalDays = rentalDays ; 
  }

  void display(){
    System.out.println("bill for customer: "+this.customerName);
    System.out.println("carModel: "+this.carModel);
    System.out.println("rental days: "+this.rentalDays);
    System.out.println("total cost: ( "+this.customerName+" )"+this.costPerday*this.rentalDays);
    System.out.println("-------------------");
  }
  public static void main(String[] args) {
    CarRental cust1 = new CarRental("ahsish", "seltos", 32) ; 
    CarRental cust2 = new CarRental("mankirt", "innova", 10) ; 
    cust1.display();
    cust2.display();
  }
}
