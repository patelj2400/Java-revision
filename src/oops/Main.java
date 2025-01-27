package oops;

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name="Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name="Leo";
        d2.walk();

        Complex num = new Complex();
        num.a=3;
        num.b=2;
        num.print();

    }
}

class Complex{

    int a,b;

    void print(){
        System.out.println(a+" + "+b+"i");
    }
}

class Dog{

    String name;
    int age;
    String color;


    void walk(){
        System.out.println(name +" is walking");
    }

    void eat(){
        System.out.println(name +" is eating");
    }

    void bark(){
        System.out.println(name +" is barking");
    }

}
