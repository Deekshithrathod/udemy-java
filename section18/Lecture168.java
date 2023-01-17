package section18;

public class Lecture168 {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println("the Div: " + c);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
        System.out.println("Bye");
    }
}
