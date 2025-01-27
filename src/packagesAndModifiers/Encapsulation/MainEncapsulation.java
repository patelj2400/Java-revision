package packagesAndModifiers.Encapsulation;

import oops.Student;
import packagesAndModifiers.learnPackage.Person;
import packagesAndModifiers.learnPackage.Students;

public class MainEncapsulation {

    public static void printHello(){
        System.out.println("Hello");
        //IT not allow
        //printHi();
    }

    public void printHi(){
        printHello();
        System.out.println("Hi");
    }


    static {
        System.out.println("called from static block");
    }

    public static void main(String[] args) {

        Students s1= new Students();
        s1.setAge(10);
        System.out.println(s1.getAge());

        Students.counter=100;

        System.out.println(Students.counter);


        Students s2= new Students();
        System.out.println(s2.counter);

        System.out.println(Math.max(5,6));

        MainEncapsulation.printHello();

        MainEncapsulation s3 = new MainEncapsulation();
        s3.printHi();

        System.out.println(Students.objectcounter);

    }

    static {
        System.out.println("called from static block 2");
    }


}
