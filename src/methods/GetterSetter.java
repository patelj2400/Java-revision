package methods;


class Student{

    private int rollNo;
    private String name;

    //accessor method
    public int getRollNo() {
        return rollNo;
    }

    //mutator method
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    //accessor method
    public String getName() {
        return name;
    }

    //mutator method
    public void setName(String name) {
        this.name = name;
    }

    public void display()
    {
        System.out.println("Roll no.: "+rollNo);
        System.out.println("Student name: "+name);
    }


}


public class GetterSetter {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(10);
        s1.setName("John");
        s1.display();

        Student s2 = new Student();
        s2.getName();
        s2.display();


    }

}
