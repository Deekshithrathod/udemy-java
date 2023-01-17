package section18;

class MinimumBalanceException extends Exception {
    public String toString() {
        return "The minimum balance should be 5,000 INR";
    }
}

public class Lecture170 {
    public static void main(String[] args) {
        try {
            throw new MinimumBalanceException();
        } catch (MinimumBalanceException minimumBalanceException) {
            System.out.println(minimumBalanceException);
        }
    }
}
