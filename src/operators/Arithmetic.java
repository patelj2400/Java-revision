package operators;

public class Arithmetic {

    public static void main(String[] args) {

        //Arithmetic Operators
        // + - Addition
        // - - Subtraction
        // * - Multiplication
        // / - Division
        // % - Modulo Operation (Reminder after division)


        int a = 11;
        int b = 7;

        int sum;
        int sub;
        int multiply;
        double divide;
        double modulo;

        // Arithmetic Operators
        sum = a + b;
        sub = a - b;
        multiply = a * b;

        //Type casting
        divide = (double) a / b;

        modulo = a % b;

        System.out.println("sum of two number = " + sum);
        System.out.println("subtraction of two number = " + sub);
        System.out.println("multiply of two number = " + multiply);
        System.out.println("divide of two number = " + divide);
        System.out.println("Modulo of two number = " + modulo);


        // int result = 5*7
        // 5 and 7 operands and * is a operator that can perform operation on operands
    }

}
