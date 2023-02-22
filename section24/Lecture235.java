package section24;

class MyArr<T>{
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

public class Lecture235 {
    static <E> void show(E[] arr){
        for (E element:arr){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        show(new String[]{"string1","string2","string3","string4"});
        show(new Integer[]{1,2,3,4});
    }
}
