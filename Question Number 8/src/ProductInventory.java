import java.util.Scanner;

public class ProductInventory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products do you want to add? ");
        int count = sc.nextInt();

        Electronics[] inventory = new Electronics[count];

        // Ask the user for each product's name and price
        for (int i = 0; i < count; i++) {
            sc.nextLine(); // clears leftover newline before reading text
            System.out.print("Enter name for product " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter price for " + name + ": ");
            double price = sc.nextDouble();

            inventory[i] = new Electronics(name, price);
        }

        System.out.println("\n--- Prices before discount ---");
        for (Electronics e : inventory) {
            e.display();
        }

        // Apply a 10% discount to every product in the array
        for (Electronics e : inventory) {
            e.applyDiscount(10.0);
        }

        System.out.println("\n--- Prices after 10% discount ---");
        for (Electronics e : inventory) {
            e.display();
        }

        sc.close();
    }
}