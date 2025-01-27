package inheritance;

// parent class //base class
public class Vehicle {

    String model;
    int wheelsCount;

    //Default constructor of Vehicle
    Vehicle(){
        System.out.println("Default Vehicle Constructor");
    }

    //Parameterized constructor of Vehicle
    Vehicle(String model, int wheelsCount){
        this.model = model;
        this.wheelsCount = wheelsCount;
        System.out.println("Parameterized Vehicle Constructor");
        System.out.println("Vehicle Wheels Count: " + wheelsCount);
        System.out.println("Vehicle model: " + model);
    }

    //Parent class method
    void start(){
        System.out.println("Parent class Method : Vehicle is starting");
    }

    final void accelerate(){
        System.out.println("Vehicle is accelerate");
    }



}
