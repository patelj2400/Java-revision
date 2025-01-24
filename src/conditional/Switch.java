package conditional;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        //In switch only primitive data types works
        //In switch also String and enum work

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day : ");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                System.out.println("This is Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: case 7:
                System.out.println("Saturday");
                System.out.println("Sunday");
                System.out.println("This is holiday");
                break;

            default:
                System.out.println("Invalid day");
        }


    }

}
