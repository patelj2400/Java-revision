package constructor;

public class ConstructorOverloading {

        int id;
        String name;
        int marks;

        //creating two arg constructor
        ConstructorOverloading(int id, String name) {
            this.id = id;
            this.name = name;
        }

        //creating three arg constructor
        ConstructorOverloading(int id, String name, int marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        //Method to show the details
        void display() {
            System.out.println(id + " " + name + " " + marks);
        }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading(1, "John");
        c1.display();

        ConstructorOverloading c2 = new ConstructorOverloading(1, "Jack",20);
        c2.display();
    }

}
