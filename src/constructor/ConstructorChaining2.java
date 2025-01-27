package constructor;

class Vehicle {

    private String make;
    private String model;
    private int year;

    // Constructor with all parameters
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Constructor that defaults the year
    public Vehicle(String make, String model) {
        this(make, model, 2020);  // Chaining to the main constructor
    }


    // Default constructor
    public Vehicle() {
        this("Unknown", "Unknown", 2020);  // Chaining to the main constructor
    }

    //Method to display vehicle details
    public void displayInfo() {
        System.out.println("Vehicle: " + make + " " + model + " (" + year + ")");
    }

}

// Derived class from Vehicle
class Car extends Vehicle {


    private boolean isConvertible;

    // Car constructor with additional attribute
    public Car(String make, String model, int year, boolean isConvertible) {
        super(make, model, year);  // Chaining to superclass Vehicle constructor
        this.isConvertible = isConvertible;
    }


    // Constructor that defaults some Car properties
    public Car() {
        super();  // Calls Vehicle's default constructor
        this.isConvertible = false;
    }


    // Overriding the displayInfo Method to include convertible info
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Convertible: " + (isConvertible ? "Yes" : "No"));
    }


}


public class ConstructorChaining2 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2022);
        vehicle.displayInfo();

        Car car = new Car("Ford", "Mustang", 2021, true);
        car.displayInfo();

        Vehicle defaultVehicle = new Vehicle();
        defaultVehicle.displayInfo();

        Car defaultCar = new Car();
        defaultCar.displayInfo();


    }
}
