package Scanner;

import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age : ");
//        int age = sc.nextInt();
//        System.out.println("Your age is = " +age);

        System.out.println("Enter First Number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber = sc.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("Total Sum Of Two Number: ");
        System.out.println(result);
        sc.close();


    }
}
