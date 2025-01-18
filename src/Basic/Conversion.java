package Basic;

public class Conversion {
    public static void main(String[] args) {

        // Typecasting


        // Widening
        // Implicit Conversion / Widening conversion /
        int a = 10;
        long b = a;
        System.out.println(b);


        int a1 = 100;
        double b1 = 10.5;
        double sum = a1 + b1;
        System.out.println(sum);

        // It will show an error
        //int sum = num1 + num2;


        // Explicit Conversion / Explicit Type casting / Narrowing conversion
        int age =150;
        byte age2 = (byte) age;
        System.out.println(age2);


        //Single line comment
        // int a = 10;


        // Multiline comment

        /*
        int age3 = (byte) age;
        short age4 = (short) age;
        short age5 = (short) age;
        long age6 = (long) age;
        long age7 = (long) age;
        float age8 = (float) age;
        System.out.println(age8);
        */


    }

}
