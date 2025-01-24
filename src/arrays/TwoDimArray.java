package arrays;

public class TwoDimArray {

    public static void main(String[] args) {

        // Row -> Student Roll Number
        // Column ->  Marks

        int marks[][] = new int[4][3];

        marks[0][0] = 11;
        marks[0][1] = 12;
        marks[0][2] = 11;

        marks[1][0] = 14;
        marks[1][1] = 15;
        marks[1][2] = 16;

        marks[2][0] = 25;
        marks[2][1] = 26;
        marks[2][2] = 29;

        marks[3][0] = 32;
        marks[3][1] = 39;
        marks[3][2] = 35;


        int marks1[][] = {
                {5,6,7},
                {12,21,23},
                {16,32,25},
                {33,25,32}};

        System.out.println(marks1[2][1]);

     }
}
