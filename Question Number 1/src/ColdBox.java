//The 'Smart Warehouse' (Inheritance & Interfaces)

public class ColdBox extends StorageUnit implements Refrigerated {
    private int currentTemp;

    ColdBox(int id, double capacity, int initialTemp) {
        super(id, capacity);
        this.currentTemp = initialTemp;
    }

    @Override
    public void adjustTemp(int temperature) {
        this.currentTemp = temperature;
        System.out.println("ColdBox [ID: " + id + "] temperature adjusted to " + currentTemp + "°C");
    }

    @Override
    void displayInfo() {
        System.out.println("ColdBox | ID: " + id + " | Capacity: " + capacity + " cu.ft | Temp: " + currentTemp + "°C");
    }
}
