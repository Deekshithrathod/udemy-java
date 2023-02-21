package section23;

import java.io.*;

class Producer extends Thread{
    OutputStream outputStream;
    Producer(OutputStream outputStream){
        this.outputStream = outputStream;
    }

    public void run(){
        int count = 0;
        while(true){
            try {
                outputStream.write(count);
                outputStream.flush();

                System.out.println("Producer: "+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer extends Thread{
    InputStream inputStream;
    Consumer(InputStream inputStream){
        this.inputStream = inputStream;
    }

    public void run(){
        int x;
        while(true){
            try {
                x = inputStream.read();

                System.out.println("Consumer: "+x);
                System.out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Lecture222 {
    public static void main(String[] args) {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        try {
            pipedOutputStream.connect(pipedInputStream);

            Producer producer = new Producer(pipedOutputStream);
            Consumer consumer = new Consumer(pipedInputStream);

            producer.start();
            consumer.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
