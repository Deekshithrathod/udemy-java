package section1;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
//        System.out.println("Enter a sentence");

        Scanner scanner = new Scanner(System.in);

//         next() reads only the next word
//        String word = scanner.next();

//         nextLine reads the sentence
//        String sentence = scanner.nextLine();

//        System.out.println(word);
//        System.out.println(sentence);

//        Reading numbers from keyboard
        System.out.println("Enter two numbers");
        int n = scanner.nextInt();
        float f = scanner.nextFloat();

        System.out.println(n);
        System.out.println(f);
    }
}
