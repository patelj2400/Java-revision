package finalkeyword;




// This is final class so it cannot be extended
public final class Vehicle {

    final int gears =4;
    static int wheels=2;


    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        //vehicle.gears = 6;

        System.out.println(vehicle.gears);
        System.out.println(vehicle.wheels);
        vehicle.wheels=6;
        System.out.println(vehicle.wheels);


    }


}


