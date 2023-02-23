package section25;

import java.util.LinkedList;

public class Lecture244 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        LinkedList<Integer> b = new LinkedList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);

        for(int i : linkedList){
            System.out.print(i+" ");
        }
        System.out.println();

        linkedList.addAll(b);
        for(int i : linkedList){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("El at 5 - "+linkedList.get(5));
        linkedList.set(5,45);
        System.out.println("El at 5 - "+linkedList.get(5));
    }
}
