package Section7;

public class Lecture67 {
    public static void main(String[] args) {
        // perform arithmetic operations
        int n1 = 5;
        int n2 = 4;

        System.out.println(getResult(n1, n2, "ADD"));
        System.out.println(getResult(n1, n2, "SUB"));
        System.out.println(getResult(n1, n2, "MUL"));
        System.out.println(getResult(n1, n2, "DIV"));
    }

    public static int getResult(int a, int b, String operation){
//        int answer = 0;
        return switch (operation){
            case "ADD" -> a+b;
            case "SUB" -> a-b;
            case "MUL" -> a*b;
            case "DIV" -> a/b;
            default -> -1;
        };
    }
}
