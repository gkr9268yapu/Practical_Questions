import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WeeklySalesLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] sales = new double[7]; // will hold 7 days of sales

        // Ask the user to enter sales for each day
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for day " + (i + 1) + ": ");
            sales[i] = sc.nextDouble();
        }

        // try-with-resources: Java will automatically close the writer
        // for us once we're done, even if something goes wrong inside
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("weekly_sales.txt"))) {

            // Go through each day's sales one by one
            for (double s : sales) {
                bw.write(String.valueOf(s)); // convert the number to text and write it
                bw.newLine();                // move to the next line for the next value
            }

            System.out.println("Weekly sales saved successfully to weekly_sales.txt");

        } catch (IOException e) {
            // This runs only if something goes wrong while writing the file
            System.out.println("Something went wrong while saving the file: " + e.getMessage());
        }
    }
}