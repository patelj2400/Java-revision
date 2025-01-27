package oops;

class Student2 {

    int id;
    String name;
    int age;

    //Insert Method
    void insertRecord(int id, String name, int age) {
        id = id;
        name = name;
        age = age;

    }

    //Print method
    void printRecord() {
        System.out.println(id + " " + name + " " + age);
    }

}

class TestStudent2{


    public static void main(String[] args) {

        //Creating objects
        Student2 s1 = new Student2();

        //Initialization through Method
        s1.insertRecord(1, "James", 20);

        //Printing through method
        s1.printRecord();

        s1.insertRecord(2, "John", 30);
        s1.printRecord();

        //s1 and s2 store in stake memory that reference to the value that store in the heap memory
        //1,James,20, 2,John,30 store in the heap memory
    }

}