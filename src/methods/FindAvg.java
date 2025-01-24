package methods;

public class FindAvg {

    public static void main(String[] args) {

        avg(6,2);

        int avgOfThree = avg(5,5,5);
        System.out.println(avgOfThree);


    }


    public static void avg(int a, int b) {
        int avg = (a + b) / 2;
        System.out.println(avg);
        return;
    }

    public static int avg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
        // This is not allow bcz once you write the return code, you are not allow to do anything.
        //System.out.println("The average is " + avg);
    }
}
