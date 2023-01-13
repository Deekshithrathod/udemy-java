package section14;

interface Test {
    void meth1();

    void meth2();
}

class My implements Test {

    @Override
    public void meth1() {
        System.out.println("Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }
}


public class Lecture142 {
    public static void main(String[] args) {
        Test t = new My();
        t.meth1();
        t.meth2();
//        t.meth3();
    }
}
