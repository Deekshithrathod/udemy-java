package section15;

class Outer {
    int x = 20;

    class Inner {
        int y = 10;

        void displayInner() {
            System.out.println(x + " " + y);
        }
    }

    void displayOuter() {
        System.out.println("x: " + x);
    }
}

public class Lecture148 {
    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.displayOuter();
        Outer.Inner inner = new Outer().new Inner();
        inner.displayInner();
    }
}
