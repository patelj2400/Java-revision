package Basic;

public class Varibles {
    public static void main(String[] args) {

        //There are 8 types of primitive data types

        //boolean
        //Stores true or false value
        //Size = 1 bit
        //Default value = false
        boolean result = false;
        boolean result2 = true;


        //Byte
        //Stores whole numbers from -128 to 127
        //Size  = 1 byte or 8 bits
        //Default value = 0
        byte a = 127;
        byte b = 127;

        // It not allow to store the out of range value
        //byte ab = 12230;

        //short
        //Stores whole numbers from -32,768 to 32,767
        //Size = 2 bytes or 16 bits
        //Default value = 0
        short c = 127;

        //int
        //Stores whole numbers from -2,147,483,648 to 2,147,483,647
        //Size = 4 bytes or 32 bits
        //Default value = 0
        int d = 127;

        //long
        //	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //Size = 8 bytes or 64 bits
        //Default value = 0L
        long e = 127L;

        //float
        //Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        //Size = 4 bytes or 32 bits
        //Default value = 0.0f
        float f = 127.0f;

        //It not allow bcz it automatically convert into double so if you want to make a float then need to assign F in the end
        //float g = 127.0;

        //It's only print some digit number not all
        float fq= 127.123456789f;
        System.out.println(fq);

        //Double
        //Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        //Size = 8 bytes or 64 bits
        //Default value = 0.0d
        double dd = 127.0d;

        //However it will print all the long digit number
        double df = 127.12345678912345d;
        System.out.println(df);

        //Double
        //Stores a single character/letter or ASCII values
        //Size = 2 bytes or 16 bits
        //Default value = '\u0000'

        char ch = 'A';
        char ch2 = '1';
        char ch3 = '%';

        //It will not print the str bcz it call before declaration
        //System.out.println(str);
        String str = "abc";


    }
}
