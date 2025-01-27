package constructor;

//Constructor name must be the same as its class name.
//A Constructor must have no explicit return type.
//A Java constructor cannot be abstract, static, final, and synchronized.

public class Bike {

    //creating a default constructor
    Bike(){
        System.out.println("Bike is created");
    }


    public static void main(String[] args) {

        //calling a default constructor
        Bike bike = new Bike();

    }

}
