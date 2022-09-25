package Lecture32;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x^2 co-efficient: ");
        float a = scanner.nextFloat();
        System.out.print("Enter x co-efficient: ");
        float b = scanner.nextFloat();
        System.out.print("Enter constant: ");
        float c = scanner.nextFloat();

        double commonPart = Math.sqrt((b*b)-(4*a*c));
        System.out.println((commonPart));

        double root1 = ((-1*b)+commonPart)/(2*a);
        double root2 = ((-1*b)-commonPart)/(2*a);

        System.out.println(root1+" "+root2);
    }
}
