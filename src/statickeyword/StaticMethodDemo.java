package statickeyword;


class MathUtils {
    // Static method
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodDemo {

    public static void main(String[] args) {

        System.out.println(MathUtils.add(1, 2));
    }

}
