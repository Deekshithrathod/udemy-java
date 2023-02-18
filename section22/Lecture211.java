package section22;

@FunctionalInterface
interface MyLambda2{
    int add(int a, int b);
}


public class Lecture211 {
    public static void main(String[] args) {
//        MyLambda2 myLambda = () -> System.out.println("Halo Wald inside");
//        myLambda.display();
        MyLambda2 myLambda2 = ((a, b) ->  a+b);
        System.out.println(myLambda2.add(3,4));
    }
}
