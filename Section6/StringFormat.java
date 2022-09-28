package Section6;

public class StringFormat {
    public static void main(String[] args) {
        int x = 10;
        System.out.printf("%d\n",x);
        System.out.printf("%8d\n",x);
        System.out.printf("%08d\n",x);
        x = -10;
        System.out.printf("%0(8d\n",x);
        x = 10;
        System.out.printf("%0+8d\n",x);

        // float
        float y = 123.45f;
        System.out.printf("%f\n",y);
        System.out.printf("%8f\n",y);
        System.out.printf("%8.2f\n",y);
        System.out.printf("%08.2f\n",y);

        // String
        String str = "Java";
        System.out.printf("%s\n",str);
        System.out.printf("%7s\n",str);
        System.out.printf("%-7s\n",str);
    }
}
