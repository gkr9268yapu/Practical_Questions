public class BankAccount {
    private double balance; // private = can't be accessed directly from outside the class

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter: lets other code READ the balance, but not change it directly
    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        } else {
            System.out.println("Deposit failed: amount must be positive.");
        }
    }

    // Withdraw with validation: blocks negative amounts and overdrawing
    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrew $" + amt + " successfully.");
        } else if (amt <= 0) {
            System.out.println("Withdrawal failed: amount must be positive.");
        } else {
            System.out.println("Withdrawal failed: insufficient funds.");
        }
    }
}