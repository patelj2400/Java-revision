package interfacelearn;

public class LearnInterfaces {
    public static void main(String[] args) {

        //Animal animal =new Animal();

        Dog dog = new Dog();
        dog.eat();
        dog.sound();
        dog.walk();

        //Not allow to change
        //Animal.EARS=5;
        System.out.println(Animal.LEGS);
        dog.listen();

    }
}

interface human{

    void walk();

    void sound();
}

interface Animal {

    public static final int LEGS =4;

    int EARS=2;

    void sound();

    void eat();

    default void listen(){
        System.out.println("Animal is listening");
    }
}

class Dog implements Animal, human {

    @Override
    public void sound() {
        System.out.println("Dog sound");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {
        System.out.println("Human walk");
    }



}