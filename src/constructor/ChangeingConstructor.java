package constructor;


//Constructor Chaining in the Same Class
class Student {
    String name;
    int age;
    String course;

    // Default Constructor
    public Student() {
        this("Unknown", 0); // Calls the parameterized constructor with 2 arguments
    }

    //Constructor Chaining:
    //When new Student() is called, the default constructor calls the 2-argument constructor, which in turn calls the 3-argument constructor.
    // Parameterized Constructor with 2 arguments
    public Student(String name, int age) {
        this(name, age, "Not Enrolled"); // Calls the parameterized constructor with 3 arguments

        //this.name = name;
        //this.age = age;

    }
    // Parameterized Constructor with 3 arguments
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

}


public class ChangeingConstructor {

    public static void main(String[] args) {

        Student student1 = new Student(); // Calls default constructor
        Student student2 = new Student("John", 20); // Calls 2-arg constructor
        Student student3 = new Student("Alice", 22, "Computer Science"); // Calls 3-arg constructor

        // Display student details
        student1.display(); // Output: Name: Unknown, Age: 0, Course: Not Enrolled
        student2.display(); // Output: Name: John, Age: 20, Course: Not Enrolled
        student3.display(); // Output: Name: Alice, Age: 22, Course: Computer Science

    }

}
