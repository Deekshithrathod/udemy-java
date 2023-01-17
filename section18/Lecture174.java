package section18;

public class Lecture174 {

    static void meth1() throws Exception {
        try {
            throw new Exception("New Exception");
        } finally {
            System.out.println("Method1 was called");
        }
    }

    public static void main(String[] args) throws Exception {
        meth1();
    }
}
