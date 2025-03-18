import java.util.ArrayList;
import java.util.List;

// Interface for Loanable
interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

// Abstract class BankAccount
abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    protected double balance; // Accessible in subclasses

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(holderName + " withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount!");
        }
    }

    public abstract double calculateInterest();

    public String getAccountDetails() {
        return "Account Number: ****" + accountNumber.substring(accountNumber.length() - 4) + 
               ", Holder: " + holderName + ", Balance: $" + balance;
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 2; // Example: Loan eligibility is twice the balance
    }

    @Override
    public boolean applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.println(holderName + " loan approved for $" + amount);
            return true;
        } else {
            System.out.println(holderName + " loan denied for $" + amount);
            return false;
        }
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

// Subclass CurrentAccount
class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; // 2% annual interest

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

// Main class to demonstrate polymorphism
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV12345", "Alice", 5000));
        accounts.add(new CurrentAccount("CUR67890", "Bob", 8000));

        for (BankAccount account : accounts) {
            System.out.println(account.getAccountDetails());
            System.out.println("Annual Interest: $" + account.calculateInterest());
            account.deposit(1000);
            account.withdraw(2000);
            account.applyForLoan(10000);
            System.out.println("--------------------------------------");
        }
    }
}

