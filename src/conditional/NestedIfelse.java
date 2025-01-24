package conditional;

public class NestedIfelse {
    public static void main(String[] args) {

        int x = 50;
        int y = 100;
        int z = 15;

        if (x>y){
            System.out.println("x is greater than y");
            if (x>z){
                System.out.println("x is greater than z");
                System.out.println("x is largerst = " +x);
            }
            else{
                System.out.println("z is greater than x");
                System.out.println("z is largerst = " +z);
            }
        }
        else{
            System.out.println("y is greater than x");
            if (y>z){
                System.out.println("y is greater than z");
                System.out.println("y is largerst = " +y);
            }
            else{
                System.out.println("z is greater than x");
                System.out.println("z is largerst = " +z);
            }
        }


    }
}
