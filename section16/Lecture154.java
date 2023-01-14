package section16;

class Example {
    static int x = 10;
    int y = 90;

    void show() {
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
    }
}

class My {
    static {
        System.out.println("Block1");
    }

    My() {
        System.out.println("My Constructor");
    }

    static {
        System.out.println("Block2");
    }
}

public class Lecture154 {
    public static void main(String[] args) {
        // static members
//        Example example1 = new Example();
//        Example example2 = new Example();
//        example1.show();
//        example2.show();
//        example1.x = 100;
//        example2.show();
        My my = new My();
    }
}
