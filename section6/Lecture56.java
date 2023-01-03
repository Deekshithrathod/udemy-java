package section6;

public class Lecture56 {
    public static void main(String[] args) {
        // Regex Exercises
        // find if a number is binary or not
//        System.out.println(isBinary("01010010110100101101010"));
//        System.out.println(isBinary("01010010110100101101012"));

        // find if a number is hexa-decimal or not
//        System.out.println(isHexadecimal("0A34AF"));
//        System.out.println(isHexadecimal("Q456345OI"));

        // find if data is in the format dd/mm/yyyy
        System.out.println(isCorrectDateFormat("01/09/2022"));
        System.out.println(isCorrectDateFormat("33/09/2022"));
        System.out.println(isCorrectDateFormat("01/19/2022"));
        System.out.println(isCorrectDateFormat("01/00/2022"));
        System.out.println(isCorrectDateFormat("00/09/2022"));
    }

    public static boolean isBinary(String number) {
        return number.matches("[0-1]+");
    }

    public static boolean isHexadecimal(String number) {
        return number.matches("[0-9A-F]+");
    }

    public static boolean isCorrectDateFormat(String date) {
        return date.matches("[1-2][0-9]|3[0-1]/0[1-9]|1[0-2]/[0-9]{4}");
    }
}
