package section18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lecture175 {
    static FileReader fileReader;
    static Scanner scanner;

    static int meth1() throws IOException {
        try {
            fileReader = new FileReader("my.txt");
            scanner = new Scanner(fileReader);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int result = a / b;
            fileReader.close();
            scanner.close();

            return result;

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
//            fileNotFoundException.toString();
        } catch (IOException ioException) {
            ioException.printStackTrace();
//            System.out.println(ioException);
        }
        return -1;
    }

    public static void main(String[] args) {
//        meth1();
    }
}
