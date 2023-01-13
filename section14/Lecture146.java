package section14;

interface Test1 {
    void meth1();

    void meth2();

    private void meth9() {
        System.out.println("This is a private method defined inside an interface");
    }

    static void staticMethod() {
        System.out.println("static method");
    }

    default void defMeth1() {
        System.out.println("def method");
        meth9();
    }
}

interface Test2 extends Test1 {
    void meth3();
}

class Supernova implements Test2 {
    @Override
    public void meth1() {
        System.out.println("1");
    }

    @Override
    public void meth2() {
        System.out.println("2");
    }

    @Override
    public void meth3() {
        System.out.println("3");
    }
}

public class Lecture146 {
    public static void main(String[] args) {
        Supernova supernova = new Supernova();
        supernova.meth1();
        supernova.meth2();
        supernova.meth3();
        supernova.defMeth1();
        Test1.staticMethod();
    }
}
