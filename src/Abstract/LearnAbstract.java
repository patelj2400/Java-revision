package Abstract;

public class LearnAbstract {

    public static void main(String[] args) {

        Car car = new Car();
        car.accelerate();
        car.brake(4);
        car.stop();
        car.honk();


    }

}

//If any class have an abstract method then class must be an abstract class
//you must have to remove the abstract method implementation.
abstract class Human{

    void speak(){
        System.out.println("Human speak");
    }

//    abstract void eat(){
//        System.out.println("Human eat");
//    }
//

    abstract void eat();


}

// We can not create an object of abstract class
// If we want to use an abstract class method, we need to create a subclass
// Abstract class have both method abstract and normal
abstract class Vehicle{

    //Abstract Method
    //It does not have a body

    abstract void accelerate();

    abstract int brake(int time);

    abstract void stop();

    void honk(){
        System.out.println("Vehicle Honks");
    }
}

class Car extends Vehicle{


    @Override
    void accelerate() {
        System.out.println("car is accelerating");
    }

    @Override
    int brake(int time) {
        System.out.println("car breaks are pushed");
        return time;
    }

    @Override
    void stop() {
        System.out.println("car stopped");
    }

    //this method override from the vehicle so it called instead of the Abstract class method
    @Override
    void honk(){
        System.out.println("car honks");
    }

}


class Scooter extends Vehicle{

    @Override
    void accelerate() {

    }

    @Override
    int brake(int time) {
        return 0;
    }

    @Override
    void stop() {

    }
}