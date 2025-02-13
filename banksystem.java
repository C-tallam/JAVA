abstract class BankAccount {
    protected double balance;
    
    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        }
    }
    
    public abstract void withdraw(double amount);
    
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $100 required.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.0;
    
    public CheckingAccount(double balance) {
        super(balance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance - (amount + TRANSACTION_FEE) >= 0) {
            balance -= (amount + TRANSACTION_FEE);
            System.out.println("Withdrawn: $" + amount + " (Fee: $1) | New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied. Insufficient balance.");
        }
    }
}

public class banksystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(500);
        CheckingAccount checking = new CheckingAccount(300);
        
        savings.deposit(200);
        savings.withdraw(550);
        savings.withdraw(50);
        
        checking.deposit(100);
        checking.withdraw(50);
        checking.withdraw(350);
    }
}

