import java.util.ArrayList;

class Account {
  private double balance;

  public Account(double balance) {
    this.balance = balance;
  }

  public double getBalance(){
    return balance ; //balance returned 
  }
  public void display() {
    System.out.println("Account Balance: " + getBalance());
  }
}

class Customer {
  private String name ; 
  private ArrayList<Account> accounts ; 

  public Customer(String name){
    this.name = name ;
    this.accounts = new ArrayList<>() ; 
  }

  public String getName(){
    return name ; 
  }

  public void addAccount(Account account){
    accounts.add(account) ; 
  }

  public void viewBalance(){
    for(Account acc : accounts){
      acc.display() ; 
    }
  }
}

class Bank{
  private String bankName ; 
  private ArrayList<Customer> customers ; 

  public Bank(String bankName){
    this.bankName = bankName ; 
    this.customers = new ArrayList<>() ; 
  }
  public String getBankName() {
    return bankName;
  }

  public void OpenAccount(Customer customer , Account account){
    customer.addAccount(account);
    if (!customers.contains(customer)) {
      customers.add(customer) ; 
    }

    System.out.println("Account opened for: " + customer.getName()+" at " + bankName) ;
  }
}

public class BankCustomerApp {
  public static void main(String[] args) {
    Bank bank  = new Bank("IDFC bank") ;
    
    Customer c1 = new Customer("raj") ; 
    Customer c2 = new Customer("rohan") ; 

    Account acc1 = new Account(1000) ; 
    Account acc2 = new Account(400) ; 

    bank.OpenAccount(c1, acc1);
    bank.OpenAccount(c2, acc2);

    c1.viewBalance();
    c2.viewBalance();
  }
}
