// Child class 1
public class Bike extends Vehicle {
    public Bike(String name) {
        super(name); // calls Vehicle's constructor to set the name
    }

    // Overriding: Bike calculates its fee differently than the parent
    @Override
    public double calculateFee() {
        return 15.0; // flat rate for bikes
    }
}
