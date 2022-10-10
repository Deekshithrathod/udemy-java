package Section10;

public class Methods {
    // functions in Object-Oriented programming are called methods
    public static void main(String[] args) {
        System.out.println(sumNumbers(1,2)); //3
        System.out.println(sumNumbers(1,2,3,4,5)); //15
        System.out.println(sumNumbers(new int[]{1, 2, 3, 4, 5})); //15
    }

    public static int sumNumbers(int... list){
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        return sum;
    }
}
