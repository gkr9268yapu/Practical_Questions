//The 'Device Manager' (Polymorphism).

class Printer extends ElectronicDevice {

    @Override
    void powerOn() {
        System.out.println("Printer is powering on.");
    }
}