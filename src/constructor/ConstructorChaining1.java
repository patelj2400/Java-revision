package constructor;
//Constructor Chaining from Parent Class
class Parent {
    String name;
    int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

}


class Child extends Parent {

    String childName;

    public Child(String name, int age, String childName) {
        super(name, age);
        this.childName = childName;
    }

    public void display() {
        System.out.println(name + " " + age + " " + childName);
    }
}


public class ConstructorChaining1 {

    public static void main(String[] args) {

        Child child = new Child("Bob", 25,"Jack");
        child.display();



    }
}
