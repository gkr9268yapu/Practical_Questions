// Subclass 1: paid a fixed monthly salary
public class FullTime extends Employee {
    double monthlySalary;

    public FullTime(String name, double monthlySalary) {
        super(name); // sets the name using Employee's constructor
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary; // flat salary, no extra calculation needed
    }
}