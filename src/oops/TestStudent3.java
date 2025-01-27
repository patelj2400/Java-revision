package oops;

//Defining a Student class.
class Student3 {

    //defining fields
    int id;
    String name;
    int age;

    // Constructor with parameters
   public Student3(int id, String name, int age) {
       this.id = id;
       this.name = name;
       this.age = age;

   }

   // Method to display student information
   public void display() {
       System.out.println("Student Id: " + id);
       System.out.println("Student Name: " + name);
       System.out.println("Student Age: " + age);
   }

}

public class TestStudent3{
    public static void main(String[] args) {

        // Creating objects of Student class with constructor
        Student3 s1 = new Student3(1, "John", 20);
        Student3 s2 = new Student3(2, "Jane", 30);

        // Displaying information of the objects
        s1.display();
        s2.display();




    }
}
