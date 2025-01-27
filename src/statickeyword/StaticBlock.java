package statickeyword;

class Test {
    //It is used to initialize the static data member.
    static int x;

    // Static block
    static {
        x = 10;
        System.out.println("Static block executed. x = " + x);
    }
}

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main method executed.");
    }
}
