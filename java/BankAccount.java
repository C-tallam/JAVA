public class BankAccount {
    private double balance;  // Private variable

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("Withdrew: $%.2f%n", amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        account.withdraw(20.0);
        account.withdraw(200.0);  // This should fail due to insufficient balance

        // Accessing balance through a method
        System.out.printf("Current Balance: $%.2f%n", account.getBalance());
    }
}