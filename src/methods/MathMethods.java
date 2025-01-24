package methods;

public class MathMethods {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(Math.min(a, b)); // Display Min number
        System.out.println(Math.max(a, b));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.abs(-3));
        System.out.println(getRandom());
        System.out.println(getrandom(10,20));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.round(5.4));
        System.out.println(Math.round(5.5));



    }

    public static int getRandom(){
        return (int) (Math.random()*6)+1;
    }

    public static int getrandom(int a, int b){
        return (int) (Math.random()*(b-a+1)+a);
    }



}
