package oops;

import java.sql.Date;
import java.sql.Time;

public class MethodOverRiding {

    public static void main(String[] args) {



        Greet greet = new Greet();
        greet.greeting();
        greet.greeting("Jay");
        greet.greeting("Jay", 10);

    }
}


class Greet{

    void greeting(){
        System.out.println("Hello Good Morning");
    }


    void greeting(String message){
        System.out.println("Hello "+message +" Good Morning");
    }

    void greeting(String message, int time){
        System.out.println("Hello "+message +" Good Morning "+ time);
    }
}