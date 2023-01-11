package section12;

class SuperClass {
    public void method1() {
        System.out.println("Method1");
    }

    public void method2() {
        System.out.println("Super Method2");
    }
}

class Sub extends SuperClass {
    public void method2() {
        System.out.println("Sub method 2");
    }

    public void method3() {
        System.out.println("method 3");
    }
}


public class Lecture130 {
    public static void main(String[] args) {
//        SuperClass superClass = new SuperClass();
//        superClass.method1();
//        superClass.method2();

//        Sub sub = new Sub();
//        sub.method1(); // meth1
//        sub.method2(); // sub meth2
//        sub.method3(); // meth 3

        SuperClass su = new Sub();
        su.method1(); // Method 1
        su.method2(); // Sub Method 2
    }
}
