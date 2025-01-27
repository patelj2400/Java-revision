package packagesAndModifiers.learnPackage;

public class Teacher {

    //Access anywhere
    public int teachingClass;

    //Private so inside class acess
    private String name;

    //Default or Package private
    int age;

    protected int studentID;

    public static void main(String[] args) {


        Teacher teacher = new Teacher();
        teacher.teachingClass = 10;
        teacher.name= "Test";
        teacher.age = 20;


    }
}
