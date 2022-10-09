package Section9;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        //find sum of all elements in arr
        System.out.println(sumOfAll(arr));

        // search an element in arr
        System.out.println(findIndex(arr, 10)); // -1
        System.out.println(findIndex(arr, 1)); // 0

        //Find maximum Element
        System.out.println(findMaxElement(arr)); //9

        // find second largestElement
        System.out.println(findSecondLargest(arr)); //8
    }

    public static int sumOfAll(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }

    public static int findIndex(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int findMaxElement(int[] arr){
        int maxElement = Integer.MIN_VALUE;

        for(int num :arr){
            maxElement = Math.max(num,maxElement);
        }
        return maxElement;
    }

    public static int findSecondLargest(int[] arr){
        int maxEl = Integer.MIN_VALUE;
        int secondMaxEl = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > maxEl) {
                secondMaxEl = maxEl;
                maxEl = j;
            }
        }
        return secondMaxEl;
    }

    public static void rotateArray(int[] arr, boolean right){
        if(right){
            int temp = arr[arr.length-1];
            for(int i=arr.length-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            return;
        }
        int temp = arr[0];
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    // inserting an element into array function
    // inserting an element from array function


    // copying an array
    // reverse copying an array
    // increasing size of an array

}
