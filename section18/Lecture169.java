package section18;

public class Lecture169 {
    public static void main(String[] args) {
        int[] arr = {40, 10, 0, 20, 30};

        try {
            int c = arr[0] / arr[1];
            System.out.println("The Div is: " + c);

            int k = 5;
            try {
                System.out.println("The " + k + "th element is: " + arr[k]);
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                System.out.println(arrayIndexOutOfBoundsException);
            }

        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
    }
}
