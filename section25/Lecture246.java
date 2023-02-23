package section25;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2){
            return 1;
        } else if (o1 > o2) {
            return -1;
        }
        return 0;
    }
}

public class Lecture246 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new MyComparator());
        priorityQueue.add(29);
        priorityQueue.add(30);
        priorityQueue.add(12);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(100);

        for (int num : priorityQueue){
            System.out.print(num+" ");
        }
        System.out.println();

        while(!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll()+" ");
        }
    }
}
