public class Electronics implements Discountable {
    String name;
    double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Required because the class implements Discountable
    @Override
    public void applyDiscount(double pct) {
        double discountAmount = price * (pct / 100);
        price = price - discountAmount;
    }

    public void display() {
        System.out.println(name + ": $" + price);
    }
}
