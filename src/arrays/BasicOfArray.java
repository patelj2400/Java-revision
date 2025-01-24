package arrays;

public class BasicOfArray {

    public static void main(String[] args) {

     //   int age[];          // Declaration
     //   age = new int[5];   // Initialisation


        // used for the same type
        // By default value 0
        // It stores in the contiguous memory
        // Once the array declare , it cannot the change runtime

        int age[] = new int[5];

        age[0] = 10;
        age[1] = 20;
        age[2] = 30;
        age[3] = 40;

        System.out.println("Length of array : " +age.length);

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]); // It prints 0 bcz by default value


    }



}
