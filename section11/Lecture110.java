package section11;

class Student {
    public String rollNumber;
    public String name;
    public String course;
    public int m1;
    public int m2;
    public int m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public int avg() {
        return total() / 3;
    }

    public char grade() {
        if (avg() >= 60) {
            return 'A';
        }
        return 'B';
    }

}

public class Lecture110 {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollNumber = "12CS2001";
        student.name = "Hari Khanna";
        student.course = "Computer Science";

        student.m1 = 89;
        student.m2 = 90;
        student.m3 = 91;

        System.out.println(student.total());
        System.out.println(student.avg());
        System.out.println(student.grade());
    }
}
