package section11;

class CylinderNew {
    private double radius;
    private double height;

    public CylinderNew(double r, double h) {
        radius = r < 0 ? 0 : r;
        height = h < 0 ? 0 : h;
    }

    public CylinderNew() {
        System.out.println("default constructor");
        radius = 1;
        height = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDimensions(int r, int h) {
        radius = r;
        height = h;
    }

    public double surfaceArea() {
        return (2 * (Math.PI * radius * radius)) + (2 * Math.PI * radius * height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Lecture116 {
    public static void main(String[] args) {
        CylinderNew cylinderNew = new CylinderNew(5, 9);
        System.out.println(cylinderNew.getHeight());
        System.out.println(cylinderNew.getRadius());
        System.out.println(cylinderNew.surfaceArea());
        System.out.println(cylinderNew.volume());

        cylinderNew.setHeight(10);
        cylinderNew.setRadius(10);
        System.out.println("---------------------");
        System.out.println(cylinderNew.getHeight());
        System.out.println(cylinderNew.getRadius());
        System.out.println(cylinderNew.surfaceArea());
        System.out.println(cylinderNew.volume());
    }
}
