// Base class
public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    // Default pay logic — subclasses override this with their own calculation
    public double calculatePay() {
        return 0.0;
    }
}
