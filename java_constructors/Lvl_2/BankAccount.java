public class BankAccount {
  public String accountnumber ; 
  protected String accHolder;
  private double balance;

  BankAccount(String accountnumber, String accHolder){
    this.accountnumber = accountnumber ; 
    this.accHolder = accHolder ; 
  }
  public double getBalance(){
    return balance ; 
  }
  public void setBalance(double balance){
    this.balance = balance ;
  }
  public void display(){
    System.out.println("account number : "+accountnumber);
    System.out.println("account Holder : "+accHolder);
  }

  public static void main(String[] args) {
    SavingsAccount sa = new SavingsAccount("2256891", "vijay") ; 
    
    sa.setBalance(78017);

    sa.display() ; 
    System.out.println("balance: "+sa.getBalance());
  }
}
class SavingsAccount extends BankAccount{
  SavingsAccount(String accnumber  , String accHolder){
    super(accnumber ,accHolder) ; 
  }
}
