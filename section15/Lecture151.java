package section15;

class OuterStatic {
    static int x = 10;
    int y = 20;

    static class InnerStatic {
        void display() {
            System.out.println(x + " this is.");
        }
    }
}

public class Lecture151 {
    public static void main(String[] args) {
        OuterStatic.InnerStatic innerStatic = new OuterStatic.InnerStatic();
        innerStatic.display();
    }
}
