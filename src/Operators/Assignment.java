package Operators;

public class Assignment {
    public static void main(String[] args) {


        // Assignment Operator
        // =    :   a=b     :   a=b;
        // +=   :   a+=b    :   a=a+b
        // -=   :   a-=b    :   a=a-b
        // *=   :   a*=b    :   a=a*b
        // /=   :   a/=b    :   a=a/b
        // %=   :   a%=b    :   a=a%b


        int a = 10;
        int b = 20;
        // a +=b; // a = a+b
        // a -=b; // a = a-b
        // a *=b; // a = a*b
        // a /=b  // a = a/b
        // a %=b  // a = a%b

        System.out.println("Assignement Operator = " + a);


        a =a+b;
        System.out.println("Assignement Operator = " + a);

        a=a-b;
        System.out.println("Assignement Operator = " + a);

        a=a*b;
        System.out.println("Assignement Operator = " + a);

        a=a/b;
        System.out.println("Assignement Operator = " + a);

        a=a%b;
        System.out.println("Assignement Operator = " + a);


    }
}
