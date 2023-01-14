package section16;

import java.util.Date;

class Student {

    String rollNumber;
    private static int rollNo = 1;

    Student() {
        rollNumber = generateRollNumber();
    }

    public String generateRollNumber() {
        Date date = new Date();
        String rollNum = "Univ-" + date.getTime() + "-" + (rollNo);
        rollNo++;
        return rollNum;
    }
}

public class Lecture160 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.rollNumber);
        System.out.println(student2.rollNumber);
    }
}
