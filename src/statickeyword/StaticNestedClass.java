package statickeyword;

class Outer {
    static class Inner {
        void display() {
            System.out.println("Inside static nested class.");
        }
    }
}

public class StaticNestedClass {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner(); // Create object of static nested class
        inner.display(); // Output: Inside static nested class.
    }
}
