package section23;

import java.io.*;

public class Lecture219 {
    public static void main(String[] args) {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section23/source1.txt");
//
//            byte inputByteArray [] = new byte[fileInputStream.available()];
//            fileInputStream.read(inputByteArray);
//
//            String str = new String(inputByteArray);
//
//            FileOutputStream fileOutputStream= new FileOutputStream("/Users/deekshith/Desktop/udemy-java/section23/source2.txt");
//            fileOutputStream.write(str.toLowerCase().getBytes());
//
//            fileOutputStream.close();
//            fileInputStream.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        copyTwoFilesIntoDestination();
    }

    public static void copyTwoFilesIntoDestination(){
        try {
            FileInputStream fileInputStream1 = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section23/source1.txt");
            FileInputStream fileInputStream2 = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section23/source2.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/deekshith/Desktop/udemy-java/section23/Destination.txt");

            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream2,fileInputStream1);
//            byte inputByteArraysCombined[] = new byte[fileInputStream1.available()+fileInputStream2.available()];
//            sequenceInputStream.read(inputByteArraysCombined);
//            sequenceInputStream.
            int b;
            while((b=sequenceInputStream.read())!=-1){
                fileOutputStream.write(b);
            }

//            fileOutputStream.write(inputByteArraysCombined);

            fileInputStream1.close();
            fileInputStream2.close();
            fileOutputStream.close();
            sequenceInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
