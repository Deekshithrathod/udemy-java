package section19;

import static java.lang.Thread.MAX_PRIORITY;

class MyThread extends Thread{
    MyThread(String nameOfThread){
        super(nameOfThread);
    }
    @Override
    public void run(){
        int i = 0;
//        while(true){
//            System.out.println(i+"-> My Thread;");
//            i++;
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
////                System.out.println(e);
//                throw new RuntimeException(e);
//            }
//        }
    }
}
public class Lecture187 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("Thread 1");
        myThread.setPriority(MAX_PRIORITY);
        myThread.setDaemon(true);

        System.out.println("ID "+ myThread.getId());
        System.out.println("Priority "+ myThread.getPriority());
        System.out.println("Name "+ myThread.getName());

        myThread.start();
        System.out.println("State "+ myThread.getState());
//        myThread.interrupt();

    }
}
