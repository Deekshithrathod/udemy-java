package Section7;

public class Lecture61 {
    public static void main(String[] args) {
        // find if a number is odd or even
//        int n = 5;
//        if(isEven(n)){
//            System.out.println("Even");
//        }else{
//            System.out.println("is odd");
//        }

        // Find protocol of a website based on URL
        String url = "https://what-the-hell.com";
        System.out.println(url.substring(0,url.indexOf(":")));

        System.out.println(url.substring(url.lastIndexOf('.')+1));
    }

    public static boolean isEven(int n){
        return (n%2) == 0;
    }
}
