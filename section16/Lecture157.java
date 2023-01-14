package section16;

class FinalMy {
    final int x = 10;

    public int getX() {
        return x;
    }

    void show() {
        System.out.println(x);
    }
}

public class Lecture157 {
    public static void main(String[] args) {
        FinalMy my = new FinalMy();
//        my.x = 10;
        my.show();
        System.out.println(my.getX());
    }
}
