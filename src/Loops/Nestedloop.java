package Loops;

public class Nestedloop {
    public static void main(String[] args) {

        //Don't use nestedloop because it cannot optimize the code

        //print 1 to 3 for 5 times
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println(j +" ");
            }
            System.out.println("Printed ====="+i);
        }



    }
}
