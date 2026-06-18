import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeePayroll {

    public static void main(String[] args) {

        // ArrayList holding a mix of FullTime and Contractor employees
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new FullTime("Alice", 5000.00));
        staff.add(new Contractor("Bob", 25.00, 120));
        staff.add(new FullTime("Carla", 4500.00));
        staff.add(new Contractor("David", 30.00, 80));

        // Write each employee's pay to a report file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("payroll_report.txt"))) {

            bw.write("--- Payroll Report ---");
            bw.newLine();

            double totalPayout = 0.0;

            // Each employee calculates pay its OWN way, depending on the subclass
            for (Employee e : staff) {
                double pay = e.calculatePay();
                totalPayout += pay;

                bw.write(e.name + ": $" + pay);
                bw.newLine();
            }

            bw.write("------------------------");
            bw.newLine();
            bw.write("Total payout: $" + totalPayout);

            System.out.println("payroll_report.txt created successfully.");

        } catch (IOException e) {
            System.out.println("Failed to write payroll report: " + e.getMessage());
        }
    }
}