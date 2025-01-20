package Loops;

import java.util.Scanner;

public class Whileloop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("Went to school, tired to learn");
            System.out.println("have you understood this?");
            flag = input.nextBoolean();
        }
    }
}
