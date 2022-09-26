package Lecture40;

public class BitWiser {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println("a is:" + a);
        System.out.println("b is:" + b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a is:" + a);
        System.out.println("b is:" + b);
    }
}
