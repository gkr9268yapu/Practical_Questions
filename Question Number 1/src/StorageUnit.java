abstract class StorageUnit {
    int id;
    double capacity;

    StorageUnit(int id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    abstract void displayInfo();
}
