package section19;

class MyData{
//    synchronized public void display(String str){
    public void display(String str){
        synchronized (this){
            for (char ch : str.toCharArray()) {
                System.out.print(ch + " ");
            }
        }
    }
}

class MyThread1 extends Thread{
    MyData data;
    MyThread1(MyData data){
        this.data = data;
    }
    @Override
    public void run(){
        data.display("Hello World");
    }
}

class MyThread2 extends Thread{
    MyData data;
    MyThread2(MyData data){
        this.data = data;
    }
    @Override
    public void run(){
        data.display("Crazy dog");
    }
}
public class Lecture191 {
    public static void main(String[] args) {
        MyData myData = new MyData();
        MyThread1 myThread1 = new MyThread1(myData);
        MyThread2 myThread2 = new MyThread2(myData);

        myThread1.start();
        myThread2.start();
    }
}
