package section7;

public class Lecture62 {
    public static void main(String[] args) {

        // find the radix of a number
        System.out.println(findRadix("010101011"));
        System.out.println(findRadix("141347"));
        System.out.println(findRadix("A41347"));
    }

    public static int findRadix(String number) {
        boolean isBinary = number.matches("[0-1]+");
        if (isBinary) {
            return 2;
        }
        boolean isOctal = number.matches("[0-8]+");
        if (isOctal) {
            return 8;
        }

        boolean isHexDecimal = number.matches("[A-F0-9]+");
        if (isHexDecimal) {
            return 16;
        }
        return -1;
    }
}
