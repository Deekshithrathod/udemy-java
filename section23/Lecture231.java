package section23;

import java.io.*;

public class Lecture231 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        writeToFile();
//        readFromFile();

        ConsumerN consumerN1 = new ConsumerN("Name1", "PhoneNumber1");
        ConsumerN consumerN2 = new ConsumerN("Name2", "PhoneNumber2");
        ConsumerN consumerN3 = new ConsumerN("Name3", "PhoneNumber3");
        ConsumerN consumerN4 = new ConsumerN("Name4", "PhoneNumber4");

        ConsumerN[] customers = {consumerN1,consumerN2,consumerN3,consumerN4};

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/deekshith/Desktop/udemy-java/section23/static/customer.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeInt(customers.length);
        for(ConsumerN f : customers){
            objectOutputStream.writeObject(f);
            System.out.println(f);
        }

        objectOutputStream.close();
        fileOutputStream.close();

        //---------------------- Read-from-file ----------------------------
        System.out.println("-------------------");
        FileInputStream fileInputStream = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section23/static/customer.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        int n = objectInputStream.readInt();
        ConsumerN[] retrievedCustomerList = new ConsumerN[n];
        for(int i=0; i<n; i++){
            retrievedCustomerList[i] = (ConsumerN) objectInputStream.readObject();
            System.out.println(retrievedCustomerList[i]);
        }

    }

    public static void writeToFile() throws IOException {
        float[] data = {1.5f, 2.5f, 3.5f, 4.5f};
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/deekshith/Desktop/udemy-java/section23/static/floats.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        dataOutputStream.writeInt(data.length);
        for(float f : data){
            dataOutputStream.writeFloat(f);
        }

        dataOutputStream.close();
        fileOutputStream.close();
    }

    public static void readFromFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/deekshith/Desktop/udemy-java/section23/static/floats.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        int n = dataInputStream.readInt();

        float[] arr = new float[n];
        for (int i=0; i<n; i++){
            arr[i] = dataInputStream.readFloat();
        }

        dataInputStream.close();
        fileInputStream.close();

        for (float f:arr) {
            System.out.println(f);
        }
    }
}
