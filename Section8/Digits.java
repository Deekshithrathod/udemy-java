package Section8;

public class Digits {
    public static void main(String[] args) {
        displayDigits(12354);
        System.out.println(countDigits(12354));
    }

    public static void displayDigits(int n){
        while(n%10 != 0){
            int digit = n%10;
            System.out.println(digit);
            n = n /10;
        }
    }

    public static int countDigits(int n){
        int count = 0;
        while(n%10 != 0){
            count++;
//            int digit = n%10;
//            System.out.println(digit);
            n = n /10;
        }
        return count;
    }
}
