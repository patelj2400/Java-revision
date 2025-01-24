package loops;

import java.util.Scanner;

public class forloop1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = input.nextInt();



        for(int i=0;i<=n;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }



    }
}
