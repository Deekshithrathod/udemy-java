package section24;

class MyData<T>{
    T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class MyArray<T>{
    T []array;

    int length = 0;

    {
        array = (T[]) new Object[20];
    }

    public T[] getArray() {
        return array;
    }

    public void setValue(T value) {
        this.array[length++] = value;
    }

    public void display(){
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}

public class Lecture233 {
    public static void main(String[] args) {
//        MyData<String> myData = new MyData<>();
//
//        myData.setData("Helo Wordl");
//        System.out.println(myData.getData());


//        MyArray<Integer> array = new MyArray<>();
//        array.setValue(1);
//        array.setValue(2);
//        array.setValue(3);

        MyArray<String> array = new MyArray<>();
        array.setValue("Helo");
        array.setValue("World");

        array.display();
    }
}
