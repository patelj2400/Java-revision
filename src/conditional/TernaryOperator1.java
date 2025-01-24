package conditional;

public class TernaryOperator1 {
    public static void main(String[] args) {


        //We can use for those condition who return actual values
        //We cannot write sout bcz its return void


        int a = 100;
        int b = 20;
        int c = 30;

        int max = a>b? a>c ? a : c : b>c ?b : c;
        System.out.println(max);
    }
}
