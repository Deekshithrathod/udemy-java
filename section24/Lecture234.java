package section24;

interface A{}
class B implements A{}
class C extends B{}


class MyArray1<T>{
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

class MyArray2 extends MyArray1<String>{}

public class Lecture234 {
    public static void main(String[] args) {
        // Same if A is a class or an interface
        MyArray1<B> myArray = new MyArray1<>();
        MyArray1<C> myArray2 = new MyArray1<>();
        MyArray1<A> myArray3 = new MyArray1<>();

//        MyArray1<String> myArray = new MyArray1<>(); // invalid

    }
}
