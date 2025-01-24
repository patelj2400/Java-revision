package methods;

public class MainMethodArgs {
    public static void main(String[] args) {
        //String[] args Demo

        //We can pass the args during main method call when needed

        // This will print all the args as an array format
        for(String arg : args) {
            System.out.println(arg);
        }

        System.out.println(args[0]);
    }
}
