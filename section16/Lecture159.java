package section16;

class CoffeeMaker {

    static CoffeeMaker ourCoffeeMaker = null;
    int milkLrs;
    int waterLrs;

    {
        milkLrs = 1;
        waterLrs = 1;
    }

    private CoffeeMaker() {
        System.out.println("Private constructor invoked");
    }

    static public CoffeeMaker getInstance() {
        if (ourCoffeeMaker == null) {
            ourCoffeeMaker = new CoffeeMaker();
        }
        return ourCoffeeMaker;
    }
}

public class Lecture159 {
    public static void main(String[] args) {
        CoffeeMaker cf1 = CoffeeMaker.getInstance();
        CoffeeMaker cf2 = CoffeeMaker.getInstance();
        CoffeeMaker cf3 = CoffeeMaker.getInstance();

        if (cf1 == cf2 && cf1 == cf3) {
            System.out.println("Same");
        }
        System.out.println(cf1);
        System.out.println(cf2);
        System.out.println(cf3);
    }
}
