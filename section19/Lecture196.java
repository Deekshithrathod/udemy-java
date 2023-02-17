package section19;

class SharedClass {
    int value = 0;
    boolean flag = true;

    synchronized public int getValue() {
        while(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        flag = true;
        notify();
        return value;
    }

    synchronized public void setValue(int value) {
        while(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.value = value;
        flag = false;
        notify();
    }
}

class ProducerThread extends Thread{
    SharedClass sharedClass;

    ProducerThread(SharedClass sharedClass){
        this.sharedClass = sharedClass;
    }

    public void run(){
        int i = 0;
        while(true) {
            sharedClass.setValue(i);
            System.out.println("Producer: "+i);
            i++;
        }
    }
}

class ConsumerThread extends Thread{
    SharedClass sharedClass;

    ConsumerThread(SharedClass sharedClass){
        this.sharedClass = sharedClass;
    }

    public void run(){
        int i = 0;
        while(true) {
            System.out.println("Consumer: "+sharedClass.getValue());
        }
    }
}

public class Lecture196 {
    public static void main(String[] args) {
        SharedClass sharedClass = new SharedClass();
        ProducerThread producerThread = new ProducerThread(sharedClass);
        ConsumerThread consumerThread= new ConsumerThread(sharedClass);

        producerThread.start();
        consumerThread.start();
    }
}
