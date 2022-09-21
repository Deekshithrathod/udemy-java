import java.lang.*;

public class Second{
	public static void main(String[] args){
		// INT
		System.out.println("Integer Min: " + Integer.MIN_VALUE);
		System.out.println("Integer Max: " + Integer.MAX_VALUE);
		System.out.println("Integer Bytes: " + Integer.BYTES);
		
		// FLOAT
		System.out.println("Float Min: " + Float.MIN_VALUE);
		System.out.println("Float Max: " + Float.MAX_VALUE);
		System.out.println("Float Bytes: " + Float.BYTES);
		
		// Double
		System.out.println("Double Min: " + Double.MIN_VALUE);
		System.out.println("Double Max: " + Double.MAX_VALUE);
		System.out.println("Double Bytes: " + Double.BYTES);
		
		// SHORT
		System.out.println("Short Min: " + Short.MIN_VALUE);
		System.out.println("Short Max: " + Short.MAX_VALUE);
		System.out.println("Short Bytes: " + Short.BYTES);
		
		// Byte
		System.out.println("Byte Min: " + Byte.MIN_VALUE);
		System.out.println("Byte Max: " + Byte.MAX_VALUE);
		System.out.println("Byte Bytes: " + Byte.BYTES);
		
		// Boolean
		//System.out.println("Integer Min: " + Integer.MIN_VALUE);
		//System.out.println("Integer Max: " + Integer.MAX_VALUE);
		//System.out.println("Integer Bytes: " + Integer.BYTES);
		
		// chars can be assigned to float, they get converted implicitly
		double num = 'f';
		System.out.println(num);
		
		
	}
}