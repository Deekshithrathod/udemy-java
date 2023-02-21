package section23;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Lecture223 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/deekshith/Desktop/udemy-java/section23/Destination.txt","rw");

        System.out.println((char) randomAccessFile.read());
        System.out.println((char) randomAccessFile.read());
        System.out.println((char) randomAccessFile.read());
        randomAccessFile.write('1');
        System.out.println((char) randomAccessFile.read());
        randomAccessFile.skipBytes(3);
        System.out.println((char) randomAccessFile.read());
        randomAccessFile.seek(0);
        System.out.println((char) randomAccessFile.read());
        System.out.println(randomAccessFile.getFilePointer());
    }
}
