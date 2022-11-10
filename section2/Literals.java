package section2;

public class Literals {
    public static void main(String[] args) {

        int bin = 0b01010;
        int oct = 012;
        int hex = 0XA;

        System.out.println(bin);
        System.out.println(oct);
        System.out.println(hex);

        // now int to other systems
        int i = 10;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));
    }
}
