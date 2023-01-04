package section7;

import section6.Lecture55;

public class Lecture61 {
    public static void main(String[] args) {
        String lecture55 = Lecture55.getDomainName("adf@jk.com");
        // find a number is odd or even
        System.out.println(isNumberEven(2)); // true
        System.out.println(isNumberEven(4)); // true
        System.out.println(isNumberEven(5)); // false

        // Find person is young or not
        int age = 22;
        if (isYoung(age)) {
            System.out.println("The person is young");
        } else {
            System.out.println("The person is NOT young");
        }

        // Find grades for given marks
//        int mark = 39;
        System.out.println(findGrade(92));
        System.out.println(findGrade(87));
        System.out.println(findGrade(78));
        System.out.println(findGrade(65));
        System.out.println(findGrade(55));
        System.out.println(findGrade(41));
    }

    public static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isYoung(int age) {
        return age > 18;
    }

    public static char findGrade(int mark) {
        if (mark > 90 && mark <= 100) {
            return 'A';
        } else if (mark > 80 && mark <= 90) {
            return 'B';
        } else if (mark > 70 && mark <= 80) {
            return 'C';
        } else if (mark > 60 && mark <= 70) {
            return 'D';
        } else if (mark > 50 && mark <= 60) {
            return 'E';
        } else if (mark > 40 && mark <= 50) {
            return 'P';
        }
        return 'F';
    }
}
