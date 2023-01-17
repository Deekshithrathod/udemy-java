package section18;

class NegativeDimensionException extends Exception {
    public String toString() {
        return "Dimension can't be negative";
    }
}

public class Lecture172 {
    static int meth2(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0) {
            throw new NegativeDimensionException();
//            throw new Exception("Negative measurements");
        }
        return l * b;
    }

    static void meth1() throws NegativeDimensionException {
        int x = meth2(-10, 5);
        System.out.println(x);
    }

    public static void main(String[] args) {
        try {
            meth1();
        } catch (NegativeDimensionException negativeDimensionException) {
            System.out.println(negativeDimensionException);
        }
    }
}
