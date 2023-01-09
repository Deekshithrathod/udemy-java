package section11;

class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return (2 * lidArea()) + (2 * Math.PI * radius * height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Lecture109 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.height = 5;
        cylinder.radius = 7;

        System.out.println(cylinder.lidArea());
        System.out.println(cylinder.totalSurfaceArea());
        System.out.println(cylinder.volume());
    }
}
