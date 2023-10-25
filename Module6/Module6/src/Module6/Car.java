package Module6;

public class Car extends Vehicle {
    double gasoline = 2.0;
    public Car() {
        System.out.println("Gasoline: " + gasoline);
    }
    public Car(int capacity, String engine, String merk, int wheelCount) {
        this.capacity = capacity;
        this.engine = engine;
        this.merk = merk;
        this.wheelCount = wheelCount;
        }
    public void infoCar() {
        System.out.println("Capacity: " + capacity + " Seats");
        System.out.println("Engine: " + engine);
        System.out.println("The Brand is: " + merk);
        System.out.println("Number of Wheel: " + wheelCount);
    }
}
