package section23;


import java.io.*;

public class Lecture221 {
    public static void main(String[] args) {
        try {
//            FileInputStream fileInputStream = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section23/source1.txt");
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            FileReader fileInputStream = new FileReader("/Users/deekshith/Desktop/udemy-java/section23/source1.txt");
            BufferedReader bufferedInputStream = new BufferedReader(fileInputStream);

            System.out.println("FIS: "+fileInputStream.markSupported());
            System.out.println("BIS: "+bufferedInputStream.markSupported());

            int x;
            while ((x=bufferedInputStream.read())!=-1){
                System.out.print((char) x);
            }
//            System.out.println(bufferedInputStream.readLine());

            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
