package section22;

@FunctionalInterface
interface MyLambda4{
    void display(String str);
}

//class SomeClassRandom{
//    public void reverse(String str){
//        StringBuilder strew = new StringBuilder(str);
//        System.out.println(strew.reverse());
//    }
//}

public class Lecture213 {
    Lecture213(String str){
        StringBuilder strew = new StringBuilder(str);
        System.out.println(strew.reverse());
    }

    public static void main(String[] args) {

//        SomeClassRandom someClassRandom = new SomeClassRandom();
//        MyLambda4 myLambda4 = System.out::println; // Static methods available on System.out
//        MyLambda4 myLambda4 = someClassRandom::reverse; //static method from other class
        MyLambda4 myLambda4 = Lecture213::new; // Constructor from the same class
        myLambda4.display("Wald is not good");

    }
}
