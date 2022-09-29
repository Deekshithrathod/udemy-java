package Section6;

public class Lecture46 {
    public static void main(String[] args) {
        // both str1 & str2 are pointing to same JAVA in string pool
//        String str1 = "JAVA";
//        String str2 = "JAVA";
//
//        System.out.println(str2.equals(str1)); // true;

//        String str1 = "JAVA";
//        String str2 = "jAVA";
//
//        System.out.println(str2.equals(str1)); // false;

        String str1 = "JAVA"; // pool reference
        String str2 = new String("JAVA"); // heap reference

        System.out.println(str2.equals(str1)); // false;
    }
}
