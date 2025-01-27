package AnonymousClass;

public class LearnAnonymous {

//    class InnerClass extends OuterClass {
//
//    }

    //Anonymous class
    OuterClass obj = new OuterClass(){

        void display() {
            System.out.println("Inside display method");
        }

        public void outerMethod() {
            System.out.println("Inside outer method");
        }
    };


    SuperInterface obj2 = new SuperInterface() {

        @Override
        public void SuperMethod() {

        }
    };


    SuperInterface obj3 = () -> {

    };

    public static void main(String[] args) {
        WalkAble walkAble = (int steps) -> {

            System.out.println("walks " + steps + " steps");
            return steps;

        };
        walkAble.Walk(55);

        WalkAble walkAble1 = (int steps) -> 2*steps;

        System.out.println(walkAble1.Walk(8));
    }


}


class OuterClass{

    public void outerMethod(){
        System.out.println("OuterClass outer method");
    }

}

//That have only 1 method
@FunctionalInterface
interface SuperInterface{
    void SuperMethod();
}

@FunctionalInterface
interface WalkAble{
    int Walk(int steps);
}