package section23;


import java.io.FileOutputStream;
import java.io.IOException;

public class Lecture217 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/deekshith/Desktop/udemy-java/section23/file.txt");
            String str = "Learn Java Programming";
//            fileOutputStream.write(str.getBytes());
//            fileOutputStream.close();

//            for(byte bt : str.getBytes()){
//                fileOutputStream.write(bt);
//            }
//            fileOutputStream.close();

            fileOutputStream.write(str.getBytes(),6,str.length()-6);
            fileOutputStream.close();

        } catch (IOException fileNotFoundException){
            throw new RuntimeException(fileNotFoundException);
        }
    }
}
