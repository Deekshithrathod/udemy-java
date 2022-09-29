package Section6;

public class Lecture56 {
    public static void main(String[] args) {
        // Find if a number is binary or not
//        String str = "1010101011100"; // true
//        String str1 = "1010101011102"; // false
//        String str2 = ""; // false
//        System.out.println(isBinary(str));
//        System.out.println(isBinary(str1));
//        System.out.println(isBinary(str2));

        // Find if a number is hexadecimal or not
//        String str3 = "1";
//        String str4 = "2";
//        String str5 = "2F";
//        String str6 = "2J";
//        String str7 = "010101";
//        System.out.println(isHexadecimal(str3)); // true
//        System.out.println(isHexadecimal(str4)); // true
//        System.out.println(isHexadecimal(str5)); // true
//        System.out.println(isHexadecimal(str6)); // false
//        System.out.println(isHexadecimal(str7)); // true

        // Find if the data  is in date dd/mm/yyyy format
        String date = "12/09/1991";
        String date1 = "59/09/1991";
        String date2 = "12/82/1991";
        String date3 = "12/09/-1991";
        String date4 = "12/-09/1991";
        String date5 = "-12/09/1991";

        System.out.println(isFormatted(date)); // true
        System.out.println(isFormatted(date1)); //false
        System.out.println(isFormatted(date2)); // false
        System.out.println(isFormatted(date3)); // false
        System.out.println(isFormatted(date4)); // false
        System.out.println(isFormatted(date5)); // false
    }

    public static boolean isBinary(String str){
        return str.matches("[0-1]+");
    }

    public static boolean isHexadecimal(String str){
        return str.matches("[0-9A-F]+");
    }

    public static boolean isFormatted(String str){
        return str.matches("[1-3][0-9]/[0-1][0-9]/[0-9]{4}");
    }
}
