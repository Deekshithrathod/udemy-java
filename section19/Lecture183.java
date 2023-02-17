package section19;

//class MyThread extends Thread{
//    @Override
//    public void run() {
//        int i = 0;
//        while(true){
//            System.out.println(i+"-> My Thread;");
//            i++;
//        }
//    }
//}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(true){
            System.out.println(i+"-> My Runnable;");
            i++;
        }
    }
}
public class Lecture183 extends Thread{
//    @Override
//    public void run() {
//        int i = 0;
//        while(true){
//            System.out.println(i+"-> My Thread;");
//            i++;
//        }
//    }
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        Lecture183 lecture183 = new Lecture183();
//        lecture183.start();
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();

        int i = 0;
        while(true){
            System.out.println(i+"-> Main Thread;");
            i++;
        }
    }
}
