package section5;

import java.util.Scanner;

public class Lecture31 {
    public static void main(String[] args) {
        // Area of triangle
        Scanner scanner = new Scanner(System.in);

        // Method 1
//        int a, b, c;
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//
//        double s, area;
//        s = (a+b+c)/2.0;
//        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
//        System.out.println(area);
//        System.out.println(s);

        // Method 2
        int b,h;
        b = scanner.nextInt();
        h = scanner.nextInt();

        double area = (b*h)/2.0;
        System.out.println(area);

        scanner.close();
    }
}
