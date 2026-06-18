import java.util.InputMismatchException;
import java.util.Scanner;

public class Safe_Math_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();

            System.out.print("Enter the second number: ");
            int b = sc.nextInt();

            // This is where things can go wrong if b is 0
            int result = a / b;
            System.out.println("Result: " + a + " / " + b + " = " + result);

        } catch (ArithmeticException e) {
            // Triggered when dividing by zero
            System.out.println("Math error: You can't divide by zero.");

        } catch (InputMismatchException e) {
            // Triggered when the user types something that isn't an integer
            System.out.println("Input error: Please enter valid whole numbers only.");

        } finally {
            // This runs no matter what — success, divide-by-zero, or bad input
            System.out.println("Calculation attempt finished.");
        }

        sc.close();
    }
}
