package constructor;


public class DefaultConstructor {


        int id;
        String name;
        int age;

        public DefaultConstructor() {
            id=0;
            name="Unknown";
            age=18;
        }

        // Parameterized Constructor (with arguments)
        public DefaultConstructor(int id, String name, int age) {
            this.id = id;
            this.name = name; // 'this' refers to the current object
            this.age = age;
        }


        // Method to display person details
        void show(){
            System.out.println("id:"+id+" name:"+name+" age:"+age);
        }


    public static void main(String[] args) {

            // Create an object using the default constructor
            DefaultConstructor dc = new DefaultConstructor();
            dc.show();

            DefaultConstructor dc2 = new DefaultConstructor(1,"Rome",30);
            dc2.show();


    }


}
