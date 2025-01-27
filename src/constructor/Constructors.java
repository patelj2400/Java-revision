package constructor;

public class Constructors {

    public static void main(String[] args) {

        // When you create an object of class, that time default constructor are called.
        // If you already created default constructor with own value during that time, the newly create constructor called.
        // If you created constructor with arguments that time we can't create a default object with default constructor


        Maths num1 = new Maths(2,3);
        Maths num2 = new Maths(4,5);
        num1.print();
        num2.print();
        System.out.println("Adding two numbers");

        Maths result = num1.add(num2);
        System.out.println(num1);
        result.print();


    }

}


class Maths{

    int a,b;

    // Default Constructor (no arguments)
    /*
    public Maths(){
        a = 5;
        b = 9;
        System.out.println("Creating Maths object");
    }
    */

    // Parameterized Constructor (with arguments)
    public Maths(int real){
        a=real;
        b=12;
    }


    public Maths(int a, int b){
            this.a = a;
            this.b = b;
    }

     void print(){
        System.out.println(a+" + "+b+"i");
    }

    Maths add(Maths num2){
        System.out.println(this);
        this.print();
        num2.print();
        return new Maths(a+num2.a,b+num2.b);
    }

}

