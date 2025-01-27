package oops;

public class MultipleObjects {



    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(),r2=new Rectangle();
        r1.insert(5,4);
        r2.insert(10,3);

        r1.calculateArea();
        r2.calculateArea();

    }
}


class Rectangle {
    int length,width;

    void insert(int a,int b) {
        length=a;
        width=b;
    }

    void calculateArea() {
        System.out.println("Area of square is: "+(length*width));
    }
}