package string;

import java.util.Scanner;

public class LearnString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName = sc.nextLine();

        System.out.println("Enter your last name : ");
        String lastName = sc.nextLine();

        //+ help to concert the string
        System.out.println("Your full name is "+firstName+" "+lastName);
        sc.close();


        //input : Jay Patel - Jay Patel
        //When you use sc.next(); it will take first word and the rest of words are ignore.
        //input : Jay Patel Kumar : Jay Patel
        //It not concerting the int number because we are using string so it print 35
        //input : 3 5 : 35





    }

}
