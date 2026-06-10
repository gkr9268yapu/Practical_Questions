//The 'Smart Warehouse' (Inheritance & Interfaces)


public class Result_Checker {
    public static void main(String[] args) {
        ColdBox box1 = new ColdBox(101, 50.0, -5);
        ColdBox box2 = new ColdBox(102, 75.5, 2);

        box1.displayInfo();
        box1.adjustTemp(-10);

        System.out.println();

        box2.displayInfo();
        box2.adjustTemp(0);
    }
}
