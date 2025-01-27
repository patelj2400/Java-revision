package packagesAndModifiers.learnPackage;

public class Students {

    public static final int id=1;
    public static int counter = 50;
    public static int objectcounter =0;

    public Students() {
        objectcounter++;
    }

    private int age;
    private String name;

    //We can access it outside
    boolean canbechange= true;

    public void setAge(int age) {
        if(canbechange) {

            if(age>0){
                this.age = age;
            }
            else {
                System.out.println("Age can't be in minus");
            }
        }
        else {
            System.out.println("Age cannot be change at this time ");
        }
    }

    boolean canbeaccess = true;

    public int getAge() {

        if(canbeaccess) {
            return age;
        }

        return -1;
    }

}
