package section23;

import java.io.*;

public class Lecture229 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/deekshith/Desktop/udemy-java/section23/static/student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Student student = new Student("halo","CSE", 12);

        objectOutputStream.writeObject(student);
        objectOutputStream.flush();

        fileOutputStream.close();
        objectOutputStream.close();

        System.out.println(student);
        nextFunction();
    }
    public static void nextFunction() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section23/static/student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student s;
        s = (Student) objectInputStream.readObject();

        System.out.println("-----");
        System.out.println(s);

        fileInputStream.close();
        objectInputStream.close();
    }
}
