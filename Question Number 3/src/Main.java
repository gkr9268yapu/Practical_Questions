//The 'Device Manager' (Polymorphism).

public class Main {
    public static void main(String[] args) {

        ElectronicDevice[] devices = {
                new Printer(),
                new Scanner()
        };

        for (ElectronicDevice d : devices) {
            d.powerOn();
        }
    }
}
