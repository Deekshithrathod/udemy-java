package Section6;

public class Lecture59 {
    public static void main(String[] args) {
        // Remove all the special characters from the String
        String str = "aB2^*(";
        System.out.println(removeSpecialChars(str));

        System.out.println(removeExtraSpaces("the  ball is    in your court     "));

        // Find number of words in a sentence
    }

    public static String removeSpecialChars(String str){
        return str.replaceAll("\\W","");
    }

    public static String removeExtraSpaces(String str){
        return str.replaceAll("\\s+"," ");
    }

    public static int numberOfWords(String sentence){
        return sentence.split("\\s+1").length;
    }
}
