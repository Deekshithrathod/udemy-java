import java.io.*;
import java.util.*;

public class First{
	public static void main(String args[]){
		// Hello World
		//System.out.println("Hello World");

		//sum of two numbers
		//int a,b,c;
		Scanner sc = new Scanner(System.in);
		//a = sc.nextInt();
		//b = sc.nextInt();
		//c = a+b;
		//System.out.println("Sum of numbers is: "+c);

		// use of radix: Convert Binary to decimal
		//sc.useRadix(2);
		//int k = sc.nextInt();
		//System.out.println(k);

		// print greeting
		//System.out.println("Enter a name: ");
		//String name = sc.next();
		//System.out.println("Hey there, "+name);

		// print sentence
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		System.out.println(sentence);
	}
}