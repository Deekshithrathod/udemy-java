package section13;

abstract class Shape {
    abstract public double perimeter();

    abstract public double area();
}

class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return radius * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    private double breadth;

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

public class Lecture138 {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.setRadius(10);
//        System.out.println(circle.area());
//        System.out.println(circle.perimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setBreadth(10);
        rectangle.setLength(10);

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
