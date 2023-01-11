package section12;

class Parent {
    Parent() {
        System.out.println("parent constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

public class Lecture123 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
