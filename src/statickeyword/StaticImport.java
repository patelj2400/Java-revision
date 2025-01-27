package statickeyword;

import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {
        double result = sqrt(25); // Directly use sqrt() without Math.
        System.out.println("Square root: " + result); // Output: Square root: 5.0
    }
}
