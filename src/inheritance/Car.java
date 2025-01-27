package inheritance;


// child class or derived class
public class Car extends Vehicle {

    final String color = "red";

    // It cannot be overide because its final
    /*
    void accelerate() {

    }

     */


    //Car method
    void start(){

        //Super. method always call first.
        super.start();
        System.out.println("Child class Method :Car is starting");


        Scooter scooter = new Scooter();
        scooter.braking(this);
    }

    //Default Constructor of Car
    Car(){

        //super();
        //this(2);

        //we can use either super or this

        super("Verna", 2);
        System.out.println("Here Car Default or Parameterized constructor called");


    }

    Car(int mirror){

    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Vehicle Model : "+car.model);
        System.out.println("Vehicle Wheels: "+car.wheelsCount);
        car.wheelsCount =4;
        car.model="i10";
        //We cannot change the final keyword variables
       // car.color="red";
        System.out.println("Car Model:"+car.model);
        System.out.println("Car Wheels:"+car.wheelsCount);
        car.start();
        car.accelerate();





    }

}


class  Scooter{


    void braking(Car car){
        System.out.println("Braking Car Model:"+car.model);
    }
}
