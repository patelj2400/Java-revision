package Operators;

public class Relational {

    public static void main(String[] args) {


        // Relational Operators
        // It always returns boolean value either true or false

        // == : Is equal to                 :   3 == 5 returns false
        // != : Not equal to                :   3!= 5 returns true
        //  > : Greater than                :   3>5 returns false
        // <  : Less than                   :   3<5 returns true
        // >= : Greater than or equal to    :   3>=5 returns false
        // <= : Less Than or equal to       :   3<=5 returns true

        int firstNumber = 3;
        int secondNumber = 5;

        System.out.println("Relational Operators");
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);


    }
}
