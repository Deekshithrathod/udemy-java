package section22;

@FunctionalInterface
interface MyLambda3{
    void display();
}

class UseLambda{
    void show(MyLambda3 myLambda3){
        myLambda3.display();
    }
}

public class Lecture212 {
    public static void main(String[] args) {
        UseLambda useLambda = new UseLambda();
        useLambda.show(()->{
            System.out.println("What the wald");
        });
    }
}
