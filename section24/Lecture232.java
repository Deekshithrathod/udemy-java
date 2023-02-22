package section24;

class GenericDemo1<T>{
    T []array = (T[]) new Object[10];
    int length = 0;
    public T[] getArray() {
        return array;
    }

    public void setValue(T value) {
        this.array[length++] = value;
    }

    public void display(){
        for (int i = 0; i <length; i++) {
            System.out.println(array[i]);
        }
    }
}
public class Lecture232 {
    public static void main(String[] args) {
//        Problem 1
//        Object object = new Object();
//        object = new String("super");
//        object = Integer.valueOf(10);
//        String string = (String) object;
//        System.out.println(string);

//        Problem 2
//        Object arr[] = new Object[3];
//        arr[0]= "HI";
//        arr[1]= "Bye";
//        arr[2]= Integer.valueOf(10);
//
//        for(int i=0; i<3; i++){
//            System.out.println(arr[i]);
//        }

//        With Generics

        GenericDemo1<String> array = new GenericDemo1<>();
        array.setValue("ST");
        array.setValue("IN");
        array.setValue("G");
        array.display();
    }
}
