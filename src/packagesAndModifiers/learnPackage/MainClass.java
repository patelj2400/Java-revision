package packagesAndModifiers.learnPackage;

//Here date package is imported

import packagesAndModifiers.Encapsulation.MainEncapsulation;

import java.util.Date;
import java.util.Scanner;


public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Date date =new Date();
        System.out.println(date);



        Teacher teacher = new Teacher();
        teacher.teachingClass =12;

        //Not accessible because of the private
       // teacher.name="InsidePackage";

        //Accessible because its inside package and default
        teacher.age=40;



        teacher.studentID=50;

        MainEncapsulation.printHello();

    }

}
