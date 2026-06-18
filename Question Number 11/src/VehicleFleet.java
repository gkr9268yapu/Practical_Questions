//Main Class
import java.util.ArrayList;

public class VehicleFleet {

    public static void main(String[] args) {

        // ArrayList of type Vehicle, but holding a mix of Bike and Bus objects
        ArrayList<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Bike("Mountain Bike"));
        fleet.add(new Bus("City Bus"));
        fleet.add(new Bike("Road Bike"));

        // Loop through the fleet — each vehicle calculates its OWN fee
        for (Vehicle v : fleet) {
            System.out.println(v.name + " rental fee: $" + v.calculateFee());
        }
    }
}