package section25;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lecture245 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(4);
        deque.add(5);
        deque.add(6);
        deque.add(7);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
    }
}
