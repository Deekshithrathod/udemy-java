package section15;

abstract class AbstractClass {
    abstract void displayAbstractClass();
}

class NormalClass {
    void displayNormalClass() {
        System.out.println("Normal Class display");
    }
}

public class Lecture152 {
    int y = 120;

    public static void main(String[] args) {
        int x = 2901;
        new AbstractClass() {
            @Override
            void displayAbstractClass() {
                System.out.println("display abstract class,x is: " + x + " ");
            }

            void meth2() {
                System.out.println("Meth2");
            }
        };

//        normalClass.displayNormalClass();
//        normalClass.
//        final int x = 10;
        class MethodLocal {
            void displayMethodLocal() {
                System.out.println("some def, x is: ");
            }

            int v = 0;
        }
//        x= 10;
    }
}

class OuterClassN {
    int x = 10;
    static int y = 0;

    class InnerClassN {
        void meth90() {
            int supe = 900;
            new AbstractClass() {

                @Override
                void displayAbstractClass() {
                    System.out.println("OuterClassN->InnerClassN->meth90->AbstractClass");
                    System.out.println(x + " " + y);
                    System.out.println(supe);
                }
            };
        }
    }
}