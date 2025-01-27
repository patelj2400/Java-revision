package constructor;

public class ParameterizedConstructor {

    int age;
    String name;

    public ParameterizedConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void Display(){
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {


        ParameterizedConstructor pc = new ParameterizedConstructor(18, "Bob");
        pc.Display();

        ParameterizedConstructor pc2 = new ParameterizedConstructor(15, "Tom");
        pc2.Display();



    }
}
