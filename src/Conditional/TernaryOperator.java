package Conditional;

public class TernaryOperator {

    public static void main(String[] args) {

        //We can use for those condition who return actual values
        //We cannot write sout bcz its return void

        int a = 100;
        int b = 20;
        int max =0;

        if (a > b){
            max = a;
        }
        else{
            max = b;
        }
        System.out.println(max);


        int max1 = a>b?a:b;
        System.out.println(max1);

    }

}
