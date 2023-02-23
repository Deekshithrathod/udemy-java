package section25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lecture243 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<Integer>(List.of(2, 3, 4, 5, 6, 7));

        arrayList.add(9);
        arrayList.add(0, 2);
        arrayList.addAll(b);

        for (int i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        arrayList.forEach(n -> System.out.println(n));
        System.out.println();
    }
}
