package arrays;

public class FindMaxNumber {
    public static void main(String[] args) {

        int marks[] = {25,38,66,78,2,900};

        int max = 0;
        for(int mark : marks) {
            if(mark > max) {
                max = mark;
            }
        }
        System.out.println(max);

    }
}
