package section22;

@FunctionalInterface
interface MyLambda{
    void display();
}

//class SomeLambda implements MyLambda{
//
//    @Override
//    public void display() {
//        System.out.println("Halo Wald");
//    }
//}

public class Lecture210 {
    public static void main(String[] args) {
//        MyLambda myLambda = new MyLambda() {
//            @Override
//            public void display() {
//                System.out.println("Halo Wald inside");
//            }
//        };
        MyLambda myLambda = () -> System.out.println("Halo Wald inside");

        myLambda.display();
//        SomeLambda someLambda = new SomeLambda();
//        someLambda.display();
    }
}
