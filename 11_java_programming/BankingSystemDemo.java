// Banking System - Hierarchical Inheritance Example
// Best practices: encapsulation, abstract class, interface, polymorphism

/**
 * Abstract class representing a generic Bank Account.
 */
abstract class BankAccount {
    private final String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) {
        if (holderName == null || holderName.isEmpty()) throw new IllegalArgumentException("Holder name cannot be empty");
        this.holderName = holderName;
    }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }

    public abstract double calculateInterest();
}

/**
 * Interface for loanable accounts.
 */
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

/**
 * Savings Account implementation.
 */
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    private boolean loanApproved;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        loanApproved = calculateLoanEligibility();
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

/**
 * Current Account implementation.
 */
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;
    private boolean loanApproved;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    @Override
    public void applyForLoan(double amount) {
        loanApproved = calculateLoanEligibility();
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() + overdraftLimit > 20000;
    }
}

/**
 * Demo for polymorphic bank account processing.
 */
public class BankingSystemDemo {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[] {
            new SavingsAccount("SAV123", "John Doe", 15000, 4.5),
            new CurrentAccount("CUR456", "Jane Smith", 5000, 20000)
        };
        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getAccountNumber() + ", Holder: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                ((Loanable)acc).applyForLoan(10000);
                System.out.println("Loan Eligible: " + ((Loanable)acc).calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}
