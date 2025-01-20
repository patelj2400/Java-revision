package Conditional;

import java.util.Scanner;

public class Ifelseifelse {


    public static void main(String[] args) {

        System.out.println("Enter the day name:");
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        System.out.println(day);

        if  (day.equals("Monday")) {
            System.out.println("Go to Office");
        }
        else if (day.equals("Tuesday")) {
            System.out.println("Go to Office");
        }
        else if (day.equals ("Wednesday")){
            System.out.println("Go to Office");
        }
        else if (day.equals("Thursday")) {
            System.out.println("Go to Office");
        }
        else if (day.equals("Friday")) {
            System.out.println("Go to Office");
        }
        else if (day.equals("Saturday")) {
            System.out.println("Go to Home");
        }
        else if (day.equals("Sunday")) {
            System.out.println("Go to Home");
        }
        else
        {
            System.out.println("Invalid day");
        }
        sc.close();
    }

}
