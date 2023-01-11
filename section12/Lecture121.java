package section12;
// This is a Demo for Inheritance

class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class Lecture121 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.height = 10;
        cylinder.radius = 5;

        System.out.println("Area: " + cylinder.area());
        System.out.println("Volume: " + cylinder.volume());
    }
}
