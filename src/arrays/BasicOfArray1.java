package arrays;

public class BasicOfArray1 {
    public static void main(String[] args) {


        int marks[] = {25,38,66,78,900};

        System.out.println(marks[0]);

        //System.out.println(marks[9]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 5


        String names[] = {"Jay" ,"Bhargav","Jigar","Riya"};

        for(int i=0;i<names.length;i++){
            System.out.println("Name is = " +names[i]);
        }

        //Array name is always plural
        //In For loop the variable name is singular

        //For each loop with array

        for(String name : names){
            System.out.println("For each = " +name);
        }
    }
}
