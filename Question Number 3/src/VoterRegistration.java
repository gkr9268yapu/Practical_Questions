import java.util.Scanner;

public class VoterRegistration {

    // Step 2: The method that performs the check
    // "throws InvalidAgeException" tells callers: "you must handle this possibility"

    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is below the minimum voting age of 18.");
        }
        System.out.println("Age " + age + ": Eligible! Registration successful.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many applicants? ");
        int count = sc.nextInt();

        int eligibleCount = 0;
        int deniedCount = 0;

        // Step 3: Handle it in main
        for (int i = 0; i < count; i++) {
            System.out.print("\nEnter age for applicant " + (i + 1) + ": ");
            int age = sc.nextInt();

            try {
                checkEligibility(age);
                eligibleCount++;
            } catch (InvalidAgeException e) {
                System.out.println("Registration denied: " + e.getMessage());
                deniedCount++;
            }
        }

        // ---- Summary ----
        System.out.println("\n--- Registration Summary ---");
        System.out.println("Total applicants: " + count);
        System.out.println("Eligible: " + eligibleCount);
        System.out.println("Denied: " + deniedCount);

        sc.close();
    }
}