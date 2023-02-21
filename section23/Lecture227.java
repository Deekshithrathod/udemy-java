package section23;

import java.io.*;

public class Lecture227 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/deekshith/Desktop/udemy-java/section23/static/student.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        Student student = new Student("halo","CSE", 12);

        dataOutputStream.writeUTF(student.name);
        dataOutputStream.writeUTF(student.dept);
        dataOutputStream.writeInt(student.rollNumber);

        fileOutputStream.close();
        dataOutputStream.close();

        System.out.println(student);
        nextFunction();
    }
    public static void nextFunction() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section23/static/student.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        Student s = new Student();
        s.name = dataInputStream.readUTF();
        s.dept = dataInputStream.readUTF();
        s.rollNumber = dataInputStream.readInt();

        System.out.println("-----");
        System.out.println(s);

        fileInputStream.close();
        dataInputStream.close();
    }
}
