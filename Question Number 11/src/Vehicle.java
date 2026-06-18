// Parent class
public class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // Default fee logic — subclasses will override this with their own version
    public double calculateFee() {
        return 0.0;
    }
}
