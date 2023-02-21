package section23;


import java.io.*;

public class Lecture220 {
    public static void main(String[] args) {
//        byte b[] = {'a','b','c','d'};
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);

//        int x;
//        while((x=byteArrayInputStream.read())!=-1){
//            System.out.println((char)x);
//        }
//        String str = new String(byteArrayInputStream.readAllBytes());
//        System.out.println(str);
//        System.out.println(byteArrayInputStream.markSupported());

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byteArrayOutputStream.write('a');
        byteArrayOutputStream.write('b');
        byteArrayOutputStream.write('c');
        byteArrayOutputStream.write('d');

        System.out.println(byteArrayOutputStream);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/deekshith/Desktop/udemy-java/section23/Destination.txt");
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
