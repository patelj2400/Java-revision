package statickeyword;

public class LearnInnerClass {

    //Nested Class
    class Toy{
        int price;

    }

    static class PlayStation{
        int price;
    }

    public static void main(String[] args) {

        //It not allow bcs clas toy is inside the LearnInnerClass
        //Toy toy=new Toy();



        Toy toy = new LearnInnerClass().new Toy();
        System.out.println(toy.price);

        LearnInnerClass obj = new LearnInnerClass();
        Toy toys = obj.new Toy();
        System.out.println(toys.price);


        //If you don't want to create an object of main class Then you can make a static method
        PlayStation ps = new PlayStation();
        System.out.println(ps.price);

    }

}
