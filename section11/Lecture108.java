package section11;

class Rectangle {
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

public class Lecture108 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.breadth = 5.0;
        rectangle.length = 5.0;

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.isSquare());
    }
}
