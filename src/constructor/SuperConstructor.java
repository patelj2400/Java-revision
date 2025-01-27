package constructor;

class Person {

    // Private fields to store the name and age of the person
    private String name;
    private int age;


    // Constructor for the Person class
    public Person(String name, int age) {
        this.name = name; // Assign the name passed to the constructor to the name field
        this.age = age;   // Assign the age passed to the constructor to the age field
    }


    //Method to display the person's information
    public void displayInfo() {
        // Print the name and age of the person to the console
        System.out.println("Name: " + name + ", Age: " + age);
    }


}


class Learner extends Person {

    // Private field to store the school name of the student
    private String school;



    // Constructor for the Student class
    public Learner(String name, int age, String school) {
        super(name, age);  // Call the superclass (Person) constructor with name and age
        this.school = school;  // Assign the school passed to the constructor to the school field
    }


    //Method to display the student's information, overriding the displayInfo Method in Person
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the displayInfo Method of the superclass (Person)

        // Print the school name of the student to the console
        System.out.println("School: " + school);
    }
}



public class SuperConstructor {

    public static void main(String[] args) {

        Learner learner = new Learner("Learner", 30, "Gold School");
        learner.displayInfo();

    }


}
