package section25;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

     @Override
    public int compareTo(Point point) {
        if(x < point.x){
            return -1;
        } else if (x > point.x) {
            return 1;
        } else{
            if (y>point.y) {
                return 1;
            } else if (y<point.y) {
                return -1;
            }
            return 0;
        }
    }
}
public class Lecture250 {
    public static void main(String[] args) {

        TreeSet<Point> treeSet = new TreeSet<>();

        treeSet.add(new Point(2,2));
        treeSet.add(new Point(0,0));
        treeSet.add(new Point(210,91));
        treeSet.add(new Point(1,2));
        treeSet.add(new Point(2,9));
        treeSet.add(new Point(1,1));

        for (Point p : treeSet){
            System.out.println(p.x+" "+ p.y);
        }
    }
}
