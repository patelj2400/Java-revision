package packagesAndModifiers.package2;

import packagesAndModifiers.learnPackage.Teacher;

public class MainPackage2 extends Teacher{


    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.teachingClass=40;

        // Private so not accessible outside package
        // teacher.name="outsidePackage";

        // Default so not accessible outside package
        // teacher.age=40;

        MainPackage2 mainPackage2 = new MainPackage2();
        mainPackage2.studentID=101;


    }
}
