package section25;

import java.util.TreeSet;

public class Lecture249 {
    public static void main(String[] args) {
        TreeSet<Character> treeSet = new TreeSet<>();

        treeSet.add('4');
        treeSet.add('3');
        treeSet.add('0');
        treeSet.add('o');
        treeSet.add('O');
        treeSet.add('1');

        for (char num : treeSet){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
