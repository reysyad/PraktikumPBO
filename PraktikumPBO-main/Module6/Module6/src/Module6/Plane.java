package Module6;

public class Plane extends Vehicle {
    double oxygenCapacity = 2000;
    public Plane(){
        System.out.println("Oxygen Capacity: " + oxygenCapacity + " Liters"); 
    }
    public Plane(int capacity, String engine, String merk, int wheelCount) {
        this.capacity = capacity;
        this.engine = engine;
        this.merk = merk;
        this.wheelCount = wheelCount;
    
    }
    public void infoPlane() {
        System.out.println("Capacity: " + capacity + " Seats");
        System.out.println("Engine: " + engine);
        System.out.println("The Brand is: " + merk);
        System.out.println("Number of Wheel: " + wheelCount);

    }

}
