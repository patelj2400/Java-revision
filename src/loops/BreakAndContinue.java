package loops;

public class BreakAndContinue {
    public static void main(String[] args) {


        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
            if(i>=10) break;
        }

        System.out.println("========================");

        int counter =0;
        while (counter < 10) {
            System.out.println(counter);
            counter++;
            if (counter==3) break;
        }


        System.out.println("========================");

        for (int i = 0; i <= 20; i += 2) {
            if(i == 2 || i ==8) continue;
            if(i>=18) break;
            System.out.println("gave trophy to = "+i);

        }


    }
}
