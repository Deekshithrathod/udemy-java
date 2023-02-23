package section25;

import java.util.HashSet;

public class Lecture248 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(6);
        hashSet.add(4);

        for (int num : hashSet){
            System.out.println(num);
        }
    }
}
