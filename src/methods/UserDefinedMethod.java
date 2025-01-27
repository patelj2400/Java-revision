package methods;

import java.util.Scanner;

public class UserDefinedMethod {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int num = input.nextInt();

        // We are creating object for accessing the method
        udmethods us = new udmethods();

        //invoking instance method
        us.checkEvenOdd(num);

        // we access directly through the class name without creating object because we use static keyword
        udmethods.square(num);

        System.out.println("sum of enter numbers : "+us.sum(num));

    }



}

class udmethods {

    //user-defined method because we have not used static keyword
    public void checkEvenOdd(int a){
        if(a%2==0){
            System.out.println(a +" is even number");
        }
        else{
            System.out.println(a + " is odd number");
        }
    }


    public static void square(int a){
        System.out.println(a + " is the square of " + a*a);

    }

    //returning the sum
    public int sum(int a){
        return a+a;
    }

}