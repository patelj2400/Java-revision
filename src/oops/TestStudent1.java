package oops;

//Object and Class Example: main() Method Outside the Class

//Creating Student class.
class Student1 {

    int id;
    String name;
    int age;


}

//Creating another class TestStudent1 which contains the main method outside the class
public class TestStudent1{

        public static void main(String[] args) {

            //Creating objects
            Student1 s1 = new Student1();

            //Initialization through Reference Variable

            //Initializing objects
            s1.id = 1;
            s1.name = "John";
            s1.age = 18;


            //Printing data
            System.out.println(s1.id);
            System.out.println(s1.name);
            System.out.println(s1.age);



        }


}



