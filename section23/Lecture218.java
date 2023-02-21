package section23;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Lecture218 {
    public static void main(String[] args) {
        try {
//            FileInputStream fileInputStream = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section23/file.txt");
            FileReader fileInputStream = new FileReader("/Users/deekshith/Desktop/udemy-java/section23/file.txt");

//            System.out.println((char)fileInputStream.read());

//            byte inputBytes[] = new byte[fileInputStream.available()];
//            fileInputStream.read(new byte[fileInputStream.available()]);
//
//            String str = new String(inputBytes);
//            System.out.println(str);

            int x;
//            do {
//                x = fileInputStream.read();
//                if(x!=-1){
//                    System.out.print((char)x);
//                }
//            }while (x!=-1);
            while((x = fileInputStream.read())!=-1){
                System.out.print((char)x);
            }

            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
