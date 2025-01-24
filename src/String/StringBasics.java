package String;

public class StringBasics {

    public static void main(String[] args) {


        // with the help of literals
        // Here both the strings variable name are different but value same so it point the same value that exits in the heap memory
        // That why string objects are immutable.
        // Data or state can't be changed.

        String name = "abc";
        String newName = "abc";

        // With the help of new keywords
        String withhelpofnew = new String("abC");

        System.out.println(name);
        System.out.println(newName);
        System.out.println(withhelpofnew);

        // it checks the references so it returns true
        if(name == newName){
            System.out.println("Both are the same");
        }

        // Here both the variable value same but created with different method so returns false
        if(name == withhelpofnew){
            System.out.println("Both are the same");
        }
        else{
            System.out.println("Both are not the same");
        }

        // It will check the value so it give returns true
        if(name.equals(withhelpofnew)){
            System.out.println("Both are the same");
        }
        else{
            System.out.println("Both are not the same");
        }


        if(name.equalsIgnoreCase(withhelpofnew)){
            System.out.println("Both are the same");
        }
        else{
            System.out.println("Both are not the same");
        }


    }

}
