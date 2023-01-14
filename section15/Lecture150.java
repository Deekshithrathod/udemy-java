package section15;

abstract class LocalInner {
    abstract void innerDisplay();
}

class LocalOuter {
    int x = 10;

    void displayLocalOuter() {
//        LocalInner localInner = new LocalInner() {
//            void innerDisplay() {
//                System.out.println("Inner most method");
//            }
//
//        };
//        localInner.innerDisplay();
        new LocalInner() {
            void innerDisplay() {
                System.out.println("Inner most method");
            }

        }.innerDisplay();
    }
}

public class Lecture150 {
    public static void main(String[] args) {
        LocalOuter localOuter = new LocalOuter();
        localOuter.displayLocalOuter();
    }
}
