package oops;


//Object and Class Example: main within the class

//Defining a Student class
public class Student {

    //defining fields

    //field or data member or instance variable

    int id;
    String name;
    int age;

    //creating main method inside the Student class

    public static void main(String[] args) {

        //Creating an object or instance

        //creating an object of Student
        Student s1 = new Student();

        //Printing values of the object
        System.out.println(s1.id); //accessing member through reference variable
        System.out.println(s1.name);
        System.out.println(s1.age);

    }

}
