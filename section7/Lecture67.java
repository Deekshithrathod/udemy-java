package section7;

import java.util.Scanner;

public class Lecture67 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        String operation = "ADD";

        System.out.println(evaluate(a, b, operation));
        System.out.println(evaluate(a, b, "SUB"));
        System.out.println(evaluate(a, b, "MUL"));
        System.out.println(evaluate(a, b, "DIV"));
    }

    public static int evaluate(int a, int b, String operation) {
        int result;
        switch (operation.toUpperCase()) {
            case "ADD" -> result = a + b;
            case "SUB" -> result = a - b;
            case "MUL" -> result = a * b;
            case "DIV" -> result = a / b;
            default -> result = -1;
        }
        return result;
    }
}
