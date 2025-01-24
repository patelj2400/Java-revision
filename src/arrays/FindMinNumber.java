package arrays;

public class FindMinNumber {
    public static void main(String[] args) {


        int marks[] = {25,38,66,78,2,900};

        int min = Integer.MAX_VALUE;

        for (int mark : marks) {
            if(mark < min){
                min = mark;
            }
        }

        System.out.println("Minimum number is: " + min);


        //Another way to get min number
        for(int i=0; i<marks.length; i++){

            if(marks[i] < min){
                min = marks[i];
            }

        }
        System.out.println("Minimum number is: " + min);

    }
}
