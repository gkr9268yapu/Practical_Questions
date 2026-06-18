import java.util.Scanner;

public class ATMSimulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1000.00); // starting balance

        System.out.println("Current balance: $" + account.getBalance());

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        account.withdraw(amount);

        System.out.println("Updated balance: $" + account.getBalance());

        sc.close();
    }
}