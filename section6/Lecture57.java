package section6;

public class Lecture57 {
    public static void main(String[] args) {
        // remove all special chars from a string
        System.out.println(removeSpecialChars("!@#$%^&*adfsjl3412789"));

        // remove extra spaces from string
        System.out.println(removeExtraSpaces("suer  kjdslf    lsdfkj"));

        // find number of words in a string
        System.out.println(numberOfWordsInSentence("suer  kjdslf    lsdfkj"));

    }

    private static String removeExtraSpaces(String str) {
        return str.replaceAll("\\s+", " ");
    }

    public static String removeSpecialChars(String str) {
        return str.replaceAll("\\W", "");
    }

    public static long numberOfWordsInSentence(String sentence) {
        return sentence.split("\\s+").length;
    }
}
