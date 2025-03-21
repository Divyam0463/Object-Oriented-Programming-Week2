class BankAccount {
  String accountNumber;
  double balance;

  public BankAccount(String accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
  }

  public void displayAccountDetails() {
      System.out.println("Account Number: " + accountNumber);
      System.out.println("Balance: $" + balance);
  }
}

class SavingsAccount extends BankAccount {
  double interestRate;
        
  public SavingsAccount(String accountNumber, double balance, double interestRate) {
      super(accountNumber, balance);
      this.interestRate = interestRate;
  }

  public void displayAccountType() {
      System.out.println("Account Type: Savings Account");
      System.out.println("Interest Rate: " + interestRate + "%");
  }
}

class CheckingAccount extends BankAccount {
  double withdrawalLimit;

  public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
      super(accountNumber, balance);
      this.withdrawalLimit = withdrawalLimit;
  }

  public void displayAccountType() {
      System.out.println("Account Type: Checking Account");
      System.out.println("Withdrawal Limit: $" + withdrawalLimit);
  }
}

class FixedDepositAccount extends BankAccount {
  int depositTerm;

  public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
      super(accountNumber, balance);
      this.depositTerm = depositTerm;
  }

  public void displayAccountType() {
      System.out.println("Account Type: Fixed Deposit Account");
      System.out.println("Deposit Term: " + depositTerm + " months");
  }
}

public class BankingSystem {
  public static void main(String[] args) {
      SavingsAccount savings = new SavingsAccount("SA123", 5000, 3.5);
      CheckingAccount checking = new CheckingAccount("CA456", 2000, 1000);
      FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000, 12);

      savings.displayAccountDetails();
      savings.displayAccountType();
      System.out.println();

      checking.displayAccountDetails();
      checking.displayAccountType();
      System.out.println();

      fixedDeposit.displayAccountDetails();
      fixedDeposit.displayAccountType();
  }
}