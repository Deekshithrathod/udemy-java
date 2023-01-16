package section17;

import section17.pack1.Demo1;
import section17.pack1.Demo2;
import section17.pack2.OPDemo1;
import section17.pack2.OPDemo2;

public class Test {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.showDemo1();

        Demo2 demo2 = new Demo2();
        demo2.showDemo2();

        OPDemo1 opDemo1 = new OPDemo1();
        opDemo1.showOPDemo1();

        OPDemo2 opDemo2 = new OPDemo2();
        opDemo2.showOPDemo2();
    }
}
