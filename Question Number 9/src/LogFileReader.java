import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogFileReader {

    public static void main(String[] args) {

        ArrayList<String> errorLines = new ArrayList<>(); // will hold only the ERROR lines

        try {
            Scanner sc = new Scanner(new File("server.log"));

            // Read the file line by line until there's nothing left
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                // Only keep lines that mention ERROR
                if (line.contains("ERROR")) {
                    errorLines.add(line);
                }
            }

            sc.close();

            // Show what we found
            System.out.println("Found " + errorLines.size() + " error line(s):");
            for (String error : errorLines) {
                System.out.println(error);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find server.log. Make sure it's in the project folder.");
        }
    }
}


/*
 * ---- STEP-BY-STEP GUIDE TO TEST THIS PROGRAM ----
 *
 * Step 1: In the same folder as LogFileReader.java, create a new file
 *         named exactly "server.log". Note not inside the module out the Module Question Number 9.
 *
 * Step 2: Paste these 4 lines into server.log and save it:
 *         INFO: Server started
 *         ERROR: Connection timeout
 *         INFO: User logged in
 *         ERROR: Disk space low
 *
 * Step 3: Run LogFileReader.java
 *
 * Step 4: The program reads server.log line by line, checking each
 *         line with line.contains("ERROR")
 *
 * Step 5: Only 2 of the 4 lines contain "ERROR", so only those 2
 *         get added to the errorLines ArrayList
 *
 * Step 6: Expected output in the console:
 *         Found 2 error line(s):
 *         ERROR: Connection timeout
 *         ERROR: Disk space low
 *
 * (The 2 INFO lines are skipped entirely, they never get added to the list, so they never get printed.)
 */