package methods;

public class InstanceMethod {
    public static void main(String[] args) {

        //Creating an object of the class
        InstanceMethod instanceMethod = new InstanceMethod();

        //invoking instance method
        System.out.println(instanceMethod.sum(5,6));


    }


    //user-defined method because we have not used static keyword
    public int sum(int a, int b) {
        return a + b;
    }
}
