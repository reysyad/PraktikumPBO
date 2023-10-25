package Module6;

public class InheritageMain {
    public static void main(String[] args){
        Plane plane = new Plane(520, "Rolls Royce", "Airbus", 20);

        System.out.println("Thats is Plane: " );
        Plane hi = new Plane();
        plane.infoPlane();
        Car car = new Car(5, "K20A", "Honda", 4);
        System.out.println("\n Thats it Car:");
        Car mazda = new Car();
        car.infoCar();
    }
}
