import java.io.*;
import java.util.Scanner;

public class ConfigLoader {

    public static void main(String[] args) {

        try {
            readConfig();
        } catch (FileNotFoundException e) {
            System.out.println("config.txt not found. Creating one with default values...");
            createDefaultConfig();
        }
    }

    // Tries to open and read config.txt
    public static void readConfig() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("config.txt"));

        System.out.println("--- Loaded Config ---");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    // Runs only if config.txt doesn't exist — writes default settings
    public static void createDefaultConfig() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"))) {
            bw.write("username=guest");
            bw.newLine();
            bw.write("volume=50");
            bw.newLine();
            bw.write("theme=light");
            bw.newLine();

            System.out.println("Default config.txt created successfully.");

        } catch (IOException e) {
            System.out.println("Failed to create config.txt: " + e.getMessage());
        }
    }
}