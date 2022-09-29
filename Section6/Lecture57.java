package Section6;

public class Lecture57 {
    public static void main(String[] args) {
        // Find the username & domain name from a email id
//        String str = "json@gmail.com";
//        String str = "alskjf1213@gmail.com";
//        String str = "asfd123#@gmail.com";
        String str = "json@fmail.com";
//        String str = "alskjf1213@fmail.com";
//        String str = "asfd123#@fmail.com";
        int indexOfAt = str.indexOf('@');
        System.out.println("The Username is: "+ str.substring(0,indexOfAt));
        System.out.println("The Domain name is: "+ str.substring(indexOfAt+1));

        // Find if the email id is a gmail id from the domain name
        System.out.println("Is the email a gmail: "+ str.substring(indexOfAt+1).startsWith("gmail"));
    }
}
