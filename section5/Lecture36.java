package section5;

public class Lecture36 {
    public static void main(String[] args) {
        int a = 9, b=12;
        System.out.println("a is "+Integer.toBinaryString(a));
        System.out.println("b is "+Integer.toBinaryString(b));

        System.out.println("a OR b is "+Integer.toBinaryString(a|b));
        System.out.println("a AND b is "+Integer.toBinaryString(a&b));
        System.out.println("a XOR b is "+Integer.toBinaryString(a^b));
        System.out.println("a NOT is "+Integer.toBinaryString(~a));
        System.out.println("a >> 1 "+Integer.toBinaryString(a>>1));
        a = -1147468156;
        System.out.println("a >>> 1 "+Integer.toBinaryString(a>>>1));
        a=9;
        System.out.println("a << 1 "+Integer.toBinaryString(a<<1));
    }
}
