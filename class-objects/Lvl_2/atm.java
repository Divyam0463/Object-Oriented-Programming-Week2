public class atm {
  String accHolder ; 
  long accNumber ;
  double bal ; 

  atm(String accHolder,long accNumber,double bal){
    this.accHolder = accHolder; 
    this.accNumber = accNumber ; 
    this.bal = bal ; 
  }

  double deposit( double amount){
    return this.bal += amount ;  //(balance instance variable of the current atm object)
  }

  double withdraw(double amount ){
    if(bal < amount){
      System.out.println("insuffcient balance to withdraw: "+amount);
      return this.bal; 
    }
    return this.bal -= amount ; 
  }
  public static void main(String[] args) {
    atm acc1 = new atm("raj", 5678, 10000) ; 
    atm acc2 = new atm("rohan", 1234, 20000) ; 

    System.out.println("balance: "+acc1.deposit(1000));
    System.out.println("balance: "+acc1.withdraw(99000));
    
    System.out.println("balance: "+acc2.deposit(1000));
    System.out.println("balance: "+acc1.withdraw(9000));
  }
}
