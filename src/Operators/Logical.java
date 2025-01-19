package Operators;

public class Logical {

    public static void main(String[] args) {
        // Logical Operator

        // &&   : (Logical AND)     :   true only if both expression1 and expression2 are true
        // ||   : (Logical OR)      :   true if either expression1 or expression2 is true
        //  !   : (Logical NOT)     :   true if expression is false and vice versa

        // 0 - false
        // 1 - true


        boolean firstExpression = false;
        boolean secondExpression = true;

        System.out.println("Logical Operators");
        System.out.println(firstExpression && secondExpression);
        System.out.println(firstExpression || secondExpression);
        System.out.println(!firstExpression);
        System.out.println(!secondExpression);


    }
}
