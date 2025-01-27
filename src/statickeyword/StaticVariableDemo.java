package statickeyword;


class Counter {
    static int count = 0; // Static variable

    Counter() {
        count++; // Increment count each time an object is created
    }
}

public class StaticVariableDemo {

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Total objects created: " + Counter.count); // Output: 3
    }
}
