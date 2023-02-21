package section23;

import java.io.File;
import java.util.Objects;

public class Lecture224 {
    public static void main(String[] args) {
        File file = new File("/Users/deekshith/Desktop/udemy-java/section23");

//        for (String fileName : Objects.requireNonNull(file.list())){
//            System.out.println(fileName);
//        }

        for (File f : Objects.requireNonNull(file.listFiles())){
            System.out.println(f.getName());
            if(f.isDirectory()){
                for(File subF: Objects.requireNonNull(f.listFiles())){
                    System.out.println("\t"+subF.getName());
//                    System.out.println(subF.getPath());
//                    System.out.println();
                }
            }
//            System.out.println(f.getPath());
//            System.out.println();
        }
    }
}
