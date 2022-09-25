package Lecture33;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        float length = scanner.nextFloat();

        System.out.print("Enter breadth: ");
        float breadth = scanner.nextFloat();

        System.out.print("Enter height: ");
        float height = scanner.nextFloat();

        float area = 2*((length*breadth)+(length*height)+(breadth*height));
        float volume = length*breadth*height;

        System.out.println("Area of the cuboid is: "+area);
        System.out.println("Volume of the cuboid is: "+volume);
    }
}
