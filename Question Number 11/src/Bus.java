// Child class 2
public class Bus extends Vehicle {
    public Bus(String name) {
        super(name);
    }

    // Overriding: Bus has its own fee logic
    @Override
    public double calculateFee() {
        return 100.0; // flat rate for buses
    }
}