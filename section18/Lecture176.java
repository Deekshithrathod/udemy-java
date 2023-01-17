package section18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lecture176 {
//    static FileReader fileReader;
//    static Scanner scanner;

    static void Divide() throws IOException {
//        scanner = new Scanner(fileReader);
//        fileReader = new FileReader("my.txt");
        try (FileReader fileReader = new FileReader("my.txt"); Scanner scanner = new Scanner(fileReader)) {
            System.out.println("Doing somthin");
        }
    }

    public static void main(String[] args) throws IOException {
        Divide();
    }
}
