package Loops;

import java.util.Scanner;

public class Forloopevensum {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = input.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum + 2*i;

        }
        System.out.println("Enter the sum = "+sum);



    }
}
