// Subclass 2: paid by the hour
public class Contractor extends Employee {
    double hourlyRate;
    int hoursWorked;

    public Contractor(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked; // pay depends on hours worked
    }
}