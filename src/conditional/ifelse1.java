package conditional;

import java.util.Scanner;

public class ifelse1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time : ");
        int time = sc.nextInt();



        if (time >= 10 && time <= 17) {
            System.out.println("office is open");
        }
        else if (time ==9 || time ==18 ) {
            System.out.println("Punch in and out");
        }
        else{
            System.out.println("office is closed");
        }

    }
}
