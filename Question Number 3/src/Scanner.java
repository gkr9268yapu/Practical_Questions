//The 'Device Manager' (Polymorphism).

class Scanner extends ElectronicDevice {

    @Override
    void powerOn() {
        System.out.println("Scanner is powering on.");
    }
}