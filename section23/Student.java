package section23;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String dept;
    int rollNumber;
    Student(){}

    public Student(String name, String dept, int rollNumber) {
        this.name = name;
        this.dept = dept;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
