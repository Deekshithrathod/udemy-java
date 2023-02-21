package section23;

import java.io.*;

public class Lecture225 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/deekshith/Desktop/udemy-java/section23/static/student.txt");
        PrintStream printStream = new PrintStream(fileOutputStream);

        Student student = new Student("halo","CSE", 12);
        printStream.println(student.name);
        printStream.println(student.dept);
        printStream.println(student.rollNumber);
        System.out.println(student);
        nextFunction();
    }
    public static void nextFunction() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section23/static/student.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        Student s = new Student();
        s.name = bufferedReader.readLine();
        s.dept = bufferedReader.readLine();
        s.rollNumber = Integer.parseInt(bufferedReader.readLine());

        System.out.println("-----");
        System.out.println(s);
    }
}
