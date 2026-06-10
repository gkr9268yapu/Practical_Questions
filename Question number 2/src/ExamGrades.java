//The 'Student Grade Filter' (ArrayList & Conditionals)

import java.util.Scanner;

public class ExamGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distinctionCount = 0;
        int passCount = 0;
        int failCount = 0;

        System.out.println("Enter marks or type 'stop' to finish:");

        while (true) {

            System.out.print("Enter mark: ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("stop")) {
                break;
            }

            int mark = Integer.parseInt(userInput);

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark. Please enter a mark between 0 and 100.");
            } else if (mark >= 90) {
                System.out.println("Result: Distinction");
                distinctionCount++;

            } else if (mark >= 40) {
                System.out.println("Result: Pass");
                passCount++;

            } else {
                System.out.println("Result: Fail");
                failCount++;
            }
        }

        System.out.println("\n===== SUMMARY =====");
        System.out.println("Distinction: " + distinctionCount);
        System.out.println("Pass: " + passCount);
        System.out.println("Fail: " + failCount);

        input.close();
    }
}