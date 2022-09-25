package Lecture31;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
//        rightAngledTriangleArea(scanner);

        scaleneTriangleArea(scanner);

    }

    public static void rightAngledTriangleArea(Scanner scanner){
        System.out.print("Enter breadth value: ");
        float breadth = scanner.nextFloat();

        System.out.print("Enter Height value: ");
        float height = scanner.nextFloat();

        float area = (breadth*height)/2;
        System.out.println("The area of the triangle is: "+area);
    }

    public static void scaleneTriangleArea(Scanner scanner){
        System.out.print("Enter side 1 value: ");
        float side1 = scanner.nextFloat();
        System.out.print("Enter side 2 value: ");
        float side2 = scanner.nextFloat();
        System.out.print("Enter side 3 value: ");
        float side3 = scanner.nextFloat();

        float s = (side1+side2+side3)/2;

        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println(area);
    }
}
