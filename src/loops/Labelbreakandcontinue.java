package loops;

public class Labelbreakandcontinue {

    public static void main(String[] args) {

        outloop:
        for (int i = 1; i <= 10; i++) {
            int j=0;
            innerloop:
            while (j<=5) {
                if(j == 3) break outloop;
                System.out.println(j+" ");
                j++;
            }
            System.out.println();



        }
    }
}
